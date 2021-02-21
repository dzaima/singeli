package si.obj;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.*;
import si.types.ct.*;
import si.types.num.*;

import java.util.*;

public class SiExpr {
  public static ProcRes TRUE = makeConst(BoolConst.TRUE);
  public static ProcRes FALSE = makeConst(BoolConst.FALSE);
  public static ProcRes makeConst(Const c) { return new ProcRes(c.type(), "!"+c); }
  
  public static class ProcRes {
    public final Type t;
    public final String id;
    public ProcRes(Type t, String id) {
      this.t = t;
      this.id = id;
    }
    public String toString() { return t.toString(); }
  }
  public static ProcRes process(ChSc sc, ExprContext e) {
    if (e instanceof VarExprContext) return sc.var(((VarExprContext) e).NAME().getText());
    
    if (e instanceof TrueExprContext) return TRUE;
    if (e instanceof FalseExprContext) return FALSE;
    if (e instanceof IntExprContext) {
      String v = sc.code.next();
      sc.code.b.append(v).append(" = i32 ").append(((IntExprContext) e).INT().getText()).append('\n');
      return new ProcRes(Int.i32, v);
    }
    if (e instanceof GroupExprContext) return process(sc, ((GroupExprContext) e).expr());
    
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      return builtin(sc, ec.l, ec.r, ec.ref, ec.ref.getText().equals("+")? sc.prog.add : sc.prog.sub);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      return builtin(sc, ec.l, ec.r, ec.ref, ec.ref.getText().equals("*")? sc.prog.mul : sc.prog.div);
    }
    if (e instanceof CallExprContext) {
      CallExprContext ec = (CallExprContext) e;
      CallableContext c = ec.callable();
      SiFn.Derv derv = sc.getFn(c.NAME().getText()).derv(sc, c);
      List<ExprContext> args = ec.expr();
      if (args.size()!=derv.args.length) throw new ParseError("Incorrect argument count", ec);
      ProcRes[] pargs = new ProcRes[args.size()];
      for (int i = 0; i < args.size(); i++) {
        ProcRes arg = SiExpr.process(sc, args.get(i));
        if (!arg.t.castableTo(derv.args[i])) throw new ParseError("Incorrect argument type: expected "+ derv.args[i]+", got "+arg, args.get(i));
        pargs[i] = arg;
      }
      return emitCall(sc, derv, pargs);
    }
    if (e instanceof EmitExprContext) {
      EmitExprContext ec = (EmitExprContext) e;
      String v = sc.code.next();
      List<ExprContext> exprs = ec.expr();
      Type t = sc.type(exprs.get(0));
      StringBuilder tmp = new StringBuilder();
      for (int i = 1; i < exprs.size(); i++) {
        ProcRes p = process(sc, ec.expr(i));
        tmp.append(' ').append(p.id);
      }
      sc.code.b.append(v).append(" = emit ").append(str(ec.STR())).append(tmp).append('\n');
      return new ProcRes(t, v);
    }
    if (e instanceof FldExprContext) {
      FldExprContext c = (FldExprContext) e;
      Def f = processDef(sc, c.e).fld(c.n.getText());
      if (f instanceof Const) return makeConst((Const) f);
      throw new ParseError("Expected value, got "+f, c);
    }
    
    if (e instanceof VecExprContext || e instanceof PtrExprContext) throw new ParseError("Expected a value, got type", e);
    throw new ParseError("TODO SiExpr::process "+e.getClass(), e);
  }
  
  private static ProcRes builtin(ChSc sc, ExprContext lc, ExprContext rc, Token ref, ArrayList<SiFn> fn) {
    ProcRes l = process(sc, lc);
    ProcRes r = process(sc, rc);
    return emitCall(sc, SiFn.derv(fn, sc, Arrays.asList(l.t, r.t), ref), l, r);
  }
  
  private static ProcRes emitCall(ChSc sc, SiFn.Derv derv, ProcRes... args) {
    String v = sc.code.next();
    StringBuilder tmp = new StringBuilder();
    for (ProcRes arg : args) tmp.append(' ').append(arg.id);
    sc.code.b.append(v).append(" = call ").append(derv.id).append(tmp).append('\n');
    return new ProcRes(derv.ret, v);
  }
  
  public static Def processDef(Sc sc, ExprContext e) {
    if (e instanceof GroupExprContext) return processDef(sc, ((GroupExprContext) e).expr());
    if (e instanceof VarExprContext) return sc.getDef(((VarExprContext) e).NAME().getText());
  
    if (e instanceof TrueExprContext) return BoolConst.TRUE;
    if (e instanceof FalseExprContext) return BoolConst.FALSE;
    if (e instanceof IntExprContext) {
      String v = ((IntExprContext) e).INT().getText();
      return new IntConst(Long.parseLong(v), Int.i32);
    }
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      Def l = processDef(sc, ec.expr(0));
      Def r = processDef(sc, ec.expr(1));
      return ec.ref.getText().equals("+")? l.add(r) : l.sub(r);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      Def l = processDef(sc, ec.expr(0));
      Def r = processDef(sc, ec.expr(1));
      return ec.ref.getText().equals("*")? l.mul(r) : l.div(r);
    }
    
    // type-only
    if (e instanceof VecExprContext) {
      VecExprContext c = (VecExprContext) e;
      Def d = sc.getDef(c.NAME().getText());
      if (!(d instanceof Num)) throw new ParseError("Expected vector element type to be a number, was "+d, c);
      Const v = processConst(sc, c.expr());
      if (!(v instanceof IntConst)) throw new ParseError("Expected vector element type to be a number, got ["+v+"]"+d, c);
      return new VecType(((IntConst) v).val, (Num) d);
    }
    if (e instanceof PtrExprContext) {
      PtrExprContext c = (PtrExprContext) e;
      return new PtrType(sc.type(c.expr()));
    }
    if (e instanceof FldExprContext) {
      FldExprContext c = (FldExprContext) e;
      return processDef(sc, c.e).fld(c.n.getText());
    }
    
    if (e instanceof CallExprContext) throw new ParseError("Cannot call functions in a static context", e);
    
    throw new ParseError("TODO SiExpr::processConst "+e.getClass(), e);
  }
  public static Const processConst(Sc sc, ExprContext e) {
    Def d = processDef(sc, e);
    if (!(d instanceof Const)) throw new ParseError("Expected a value, got "+d, e);
    return (Const) d;
  }
  
  
  
  public static String str(TerminalNode STR) {
    String s = STR.getText();
    return s.substring(1, s.length()-1);
  }
}
