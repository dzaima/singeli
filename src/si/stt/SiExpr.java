package si.stt;

import si.*;
import si.gen.SingeliParser.*;
import si.types.*;
import si.types.ct.*;

public class SiExpr {
  public static Type process(Sc sc, ExprContext e) {
    if (e instanceof VarExprContext) {
      return sc.var(((VarExprContext) e).NAME().getText());
    }
    if (e instanceof IntExprContext) {
      return Int.i32;
    }
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      Type l = process(sc, ec.expr(0));
      Type r = process(sc, ec.expr(1));
      if (!l.equals(r)) throw new ParseError("Expected '+' to have args of equal types: got "+l+" and "+r, ec);
      if (!(l instanceof Int) && !(l instanceof VecType)) throw new ParseError("Didn't expect "+l+" as argument to '+'", ec);
      return l;
    }
    throw new ParseError("TODO "+e.getClass(), e);
  }
  
  public static Const processConst(Sc sc, ExprContext e) {
    if (e instanceof VarExprContext) {
      Def d = sc.getDef(((VarExprContext) e).NAME().getText());
      if (!(d instanceof Const)) throw new ParseError("Expected constant, got "+d, e);
      return (Const) d;
    }
    if (e instanceof IntExprContext) {
      String v = ((IntExprContext) e).INT().getText();
      return new IntConst(Long.parseLong(v), Int.i32);
    }
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      return processConst(sc, ec.expr(0)).add(processConst(sc, ec.expr(1)));
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      return processConst(sc, ec.expr(0)).mul(processConst(sc, ec.expr(1)));
    }
    throw new ParseError("TODO "+e.getClass(), e);
  }
}
