package si.obj;

import si.*;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.*;
import si.types.ct.*;
import si.types.num.*;

import java.util.List;

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
      if (!l.t.equals(r.t)) throw new ParseError("Expected '+' to have args of equal types: got "+l+" and "+r, ec);
      if (!(l.t instanceof Num) && !(l.t instanceof VecType)) throw new ParseError("Didn't expect "+l+" as argument to '+'", ec);
      String v = sc.code.next();
      sc.code.b.append(v).append(" = add ").append(l.t).append(' ').append(l.id).append(' ').append(r.id).append('\n');
      return new ProcRes(l.t, v);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      ProcRes l = process(sc, ec.expr(0));
      ProcRes r = process(sc, ec.expr(1));
      if (!l.t.equals(r.t)) throw new ParseError("Expected '*' to have args of equal types: got "+l+" and "+r, ec);
      if (!(l.t instanceof Num) && !(l.t instanceof VecType)) throw new ParseError("Didn't expect "+l+" as argument to '*'", ec);
      String v = sc.code.next();
      sc.code.b.append(v).append(" = mul ").append(l.t).append(' ').append(l.id).append(' ').append(r.id).append('\n');
      return new ProcRes(l.t, v);
    }
    if (e instanceof CallExprContext) {
      CallExprContext ec = (CallExprContext) e;
      CallableContext c = ec.callable();
      SiFn.Derv derv = sc.getFn(c.NAME().getText()).derv(sc, c);
      List<ExprContext> args = ec.expr();
      if (args.size()!=derv.args.length) throw new ParseError("Incorrect argument count", ec);
      String v = sc.code.next();
      StringBuilder tmp = new StringBuilder();
      for (int i = 0; i < args.size(); i++) {
        ProcRes arg = SiExpr.process(sc, args.get(i));
        if (!arg.t.castableTo(derv.args[i])) throw new ParseError("Incorrect argument type: expected "+derv.args[i]+", got "+arg, args.get(i));
        tmp.append(' ').append(arg.id);
      }
      sc.code.b.append(v).append(" = call ").append(derv.id).append(tmp).append('\n');
      return new ProcRes(derv.ret, v);
    }
    if (e instanceof VecExprContext || e instanceof PtrExprContext) throw new ParseError("Expected a value, got type", e);
    throw new ParseError("TODO SiExpr::process "+e.getClass(), e);
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
    
    throw new ParseError("TODO SiExpr::processConst "+e.getClass(), e);
  }
  public static Const processConst(Sc sc, ExprContext e) {
    Def d = processDef(sc, e);
    if (!(d instanceof Const)) throw new ParseError("Expected a value, got "+d, e);
    return (Const) d;
  }
}
