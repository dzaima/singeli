package si.stt;

import si.*;
import si.gen.SingeliParser.*;
import si.types.Type;

public class SiStt {
  public static void process(Sc.ChSc sc, SttContext stt) {
    if (stt instanceof ExprSttContext) {
      SiExpr.process(sc, ((ExprSttContext) stt).expr());
      return;
    }
    if (stt instanceof NvarSttContext) {
      NvarSttContext c = (NvarSttContext) stt;
      Type exprType = c.t==null? null : SiExpr.process(sc, c.t);
      Type varType = SiExpr.process(sc, c.v);
      String varName = c.NAME().getText();
      if (exprType!=null && !exprType.castableTo(varType)) throw new ParseError("Cannot assign "+exprType+" to "+varType, stt);
      sc.addVar(varName, varType);
      return;
    }
    throw new ParseError("TODO SiStt::process "+stt.getClass(), stt);
  }
}
