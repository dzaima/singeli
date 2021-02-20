package si.stt;

import si.*;
import si.gen.SingeliParser.*;
import si.types.*;
import si.types.ct.*;
import si.types.num.*;

import java.util.List;

public class SiExpr {
  public static Type process(Sc.ChSc sc, ExprContext e) {
    if (e instanceof VarExprContext) return sc.var(((VarExprContext) e).NAME().getText());
    
    if (e instanceof IntExprContext) return Int.i32;
    if (e instanceof GroupExprContext) return process(sc, ((GroupExprContext) e).expr());
    
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      Type l = process(sc, ec.expr(0));
      Type r = process(sc, ec.expr(1));
      if (!l.equals(r)) throw new ParseError("Expected '+' to have args of equal types: got "+l+" and "+r, ec);
      if (!(l instanceof Num) && !(l instanceof VecType)) throw new ParseError("Didn't expect "+l+" as argument to '+'", ec);
      return l;
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      Type l = process(sc, ec.expr(0));
      Type r = process(sc, ec.expr(1));
      if (!l.equals(r)) throw new ParseError("Expected '*' to have args of equal types: got "+l+" and "+r, ec);
      if (!(l instanceof Num) && !(l instanceof VecType)) throw new ParseError("Didn't expect "+l+" as argument to '*'", ec);
      return l;
    }
    if (e instanceof CallExprContext) {
      CallExprContext ec = (CallExprContext) e;
      CallableContext c = ec.callable();
      SiFn.Derv derv = sc.getFn(c.NAME().getText()).derv(sc, c);
      List<ExprContext> args = ec.expr();
      if (args.size()!=derv.args.length) throw new ParseError("Incorrect argument count", ec);
      for (int i = 0; i < args.size(); i++) {
        Type arg = SiExpr.process(sc, args.get(i));
        if (!arg.castableTo(derv.args[i])) throw new ParseError("Incorrect argument type: expected "+derv.args[i]+", got "+arg, args.get(i));
      }
      return derv.ret;
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
