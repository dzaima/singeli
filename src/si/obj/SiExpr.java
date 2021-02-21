package si.obj;

import org.antlr.v4.runtime.tree.TerminalNode;
import si.*;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.*;
import si.types.ct.*;
import si.types.num.*;

import java.util.*;

public class SiExpr {
  public static ProcRes makeConst(ChSc sc, Const c) {
    return new ProcRes(c.type(), "!"+c);
  }
  
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
    
    if (e instanceof IntExprContext) {
      String v = sc.code.next();
      sc.code.b.append(v).append(" = i32 ").append(((IntExprContext) e).INT().getText()).append('\n');
      return new ProcRes(Int.i32, v);
    }
    if (e instanceof GroupExprContext) return process(sc, ((GroupExprContext) e).expr());
    
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      ProcRes l = process(sc, ec.expr(0));
      ProcRes r = process(sc, ec.expr(1));
      if (!l.t.equals(r.t)) throw new ParseError("Expected '+' to have args of equal types: got "+l+" and "+r, ec.ref);
      return emitCall(sc, SiFn.derv(sc.prog.add, sc, Main.of(l.t), ec.ref), l, r);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      ProcRes l = process(sc, ec.expr(0));
      ProcRes r = process(sc, ec.expr(1));
      if (!l.t.equals(r.t)) throw new ParseError("Expected '*' to have args of equal types: got "+l+" and "+r, ec.ref);
      return emitCall(sc, SiFn.derv(sc.prog.mul, sc, Main.of(l.t), ec.ref), l, r);
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
    if (e instanceof VecExprContext || e instanceof PtrExprContext) throw new ParseError("Expected a value, got type", e);
    throw new ParseError("TODO SiExpr::process "+e.getClass(), e);
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
    
    if (e instanceof IntExprContext) {
      String v = ((IntExprContext) e).INT().getText();
      return new IntConst(Long.parseLong(v), Int.i32);
    }
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      return processDef(sc, ec.expr(0)).add(processDef(sc, ec.expr(1)));
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      return processDef(sc, ec.expr(0)).mul(processDef(sc, ec.expr(1)));
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
