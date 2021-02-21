package si.obj;

import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.Sc;
import si.types.Def;

import java.util.List;

public class SiReq {
  public static boolean bad(Sc sc, TreqContext ctx, String[] ns, List<Def> ts) {
    if (ctx instanceof EqReqContext) {
      Def l = SiExpr.processDef(sc, ((EqReqContext) ctx).l);
      Def r = SiExpr.processDef(sc, ((EqReqContext) ctx).r);
      return !l.equals(r);
    }
    throw new ParseError("TODO SiReq::bad "+ctx.getClass());
  }
}
