package si.obj;

import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.Sc;
import si.types.Def;
import si.types.ct.BoolConst;

public class SiReq {
  public static boolean bad(Sc sc, TreqContext ctx) {
    if (ctx instanceof EqReqContext) {
      Def l = SiExpr.processDef(sc, ((EqReqContext) ctx).l);
      Def r = SiExpr.processDef(sc, ((EqReqContext) ctx).r);
      return !l.equals(r);
    }
    if (ctx instanceof BoolReqContext) {
      Def d = SiExpr.processDef(sc, ((BoolReqContext) ctx).e);
      if (d instanceof BoolConst) return !((BoolConst) d).b;
      if (d instanceof Def.NoDef) return true;
      throw new ParseError("Expected boolean, got "+d, ctx);
    }
    throw new ParseError("TODO SiReq::bad "+ctx.getClass());
  }
}
