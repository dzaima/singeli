package si.stt;

import si.Sc;
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
      Type exprType = SiExpr.process(sc, c.expr());
      Type varType = sc.type(c.type());
      String varName = c.NAME().getText();
      if (!exprType.castableTo(varType)) throw new Error("Cannot assign "+exprType+" to "+varName+" for variable "+varName);
      sc.addVar(varName, varType);
      return;
    }
    throw new Error("TODO "+stt.getClass());
  }
}
