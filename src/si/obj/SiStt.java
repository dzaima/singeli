package si.obj;

import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.ChSc;
import si.types.*;

public class SiStt {
  public static void process(ChSc sc, SttContext stt) {
    if (stt instanceof ExprSttContext) {
      SiExpr.process(sc, ((ExprSttContext) stt).expr());
      return;
    }
    if (stt instanceof NvarSttContext) {
      NvarSttContext c = (NvarSttContext) stt;
      Type exprType = c.t==null? null : sc.type(c.t); // TODO tests
      SiExpr.ProcRes varType = SiExpr.process(sc, c.v);
      String varName = c.NAME().getText();
      if (exprType!=null && !exprType.castableTo(varType.t)) throw new ParseError("Cannot assign "+exprType+" to "+varType, stt);
      sc.addVar(varName, varType);
      return;
    }
    if (stt instanceof RetnSttContext) {
      SiExpr.ProcRes v = SiExpr.process(sc, ((RetnSttContext) stt).e);
      if (sc.code.ret==null) sc.code.ret = v.t;
      else if (!sc.code.ret.equals(v.t)) throw new ParseError("Returning incorrect type "+v.t, stt.getStart());
      sc.code.b.append("ret ").append(v.id).append('\n');
      return;
    }
    if (stt instanceof BlockSttContext) {
      ChSc nsc = new ChSc(sc, sc.code);
      for (SttContext c : ((BlockSttContext) stt).stt()) SiStt.process(nsc, c);
      return;
    }
    if (stt instanceof IfSttContext) {
      IfSttContext c = (IfSttContext) stt;
      SiExpr.ProcRes cond = SiExpr.process(sc, c.c);
      if (!cond.t.equals(Bool.u1)) throw new ParseError("Expected boolean argument to 'if', got "+cond.t);
      
      String lf = sc.code.nextLbl();
      String lt = c.f==null? null : sc.code.nextLbl();
      
      sc.code.b.append("gotoF ").append(cond.id).append(' ').append(lf).append('\n');
      SiStt.process(sc, c.t);
      if (c.f!=null) sc.code.b.append("goto ").append(lt).append('\n');
      
      sc.code.b.append("lbl ").append(lf).append('\n');
      if (c.f!=null) {
        SiStt.process(sc, c.f);
        sc.code.b.append("lbl ").append(lt).append('\n');
      }
      return;
    }
    throw new ParseError("TODO SiStt::process "+stt.getClass(), stt);
  }
}
