package si.obj;

import si.ParseError;
import si.gen.SingeliParser;
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
      Type expType = c.t==null? null : sc.type(c.t); // TODO tests
      SiExpr.ProcRes expr = SiExpr.process(sc, c.v);
      if (expType!=null && !expType.castableTo(expr.t)) throw new ParseError("Cannot assign "+expType+" to "+expr.t, stt);
      if (expr.id.startsWith("!")) {
        String v = sc.code.next();
        sc.code.b.append("new ").append(v).append(" val ").append(expr.t).append(' ').append(expr.id).append('\n');
        expr = new SiExpr.ProcRes(expr.t, v);
      }
      sc.addVar(c.k.getText(), expr);
      return;
    }
    if (stt instanceof MvarSttContext) {
      MvarSttContext c = (MvarSttContext) stt;
      SiExpr.ProcRes prev = sc.var(c.k.getText());
      SiExpr.ProcRes curr = SiExpr.process(sc, c.v);
      if (!curr.t.castableTo(prev.t)) throw new ParseError("Cannot assign "+curr.t+" to "+prev.t, stt);
      sc.code.b.append("mut ").append(prev.id).append(' ').append(curr.id).append('\n');
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
      ExprContext e = c.c;
      String cond = SiExpr.processBool(sc, e);
  
      String lf = sc.code.nextLbl();
      String lt = c.f==null? null : sc.code.nextLbl();
      
      sc.code.b.append("gotoF ").append(cond).append(' ').append(lf).append('\n');
      SiStt.process(sc, c.t);
      if (c.f!=null) sc.code.b.append("goto ").append(lt).append('\n');
      
      sc.code.b.append("lbl ").append(lf).append('\n');
      if (c.f!=null) {
        SiStt.process(sc, c.f);
        sc.code.b.append("lbl ").append(lt).append('\n');
      }
      return;
    }
    if (stt instanceof WhileSttContext) {
      WhileSttContext c = (WhileSttContext) stt;
      String lCont = sc.code.nextLbl();
      String lCond = sc.code.nextLbl();
      sc.code.b.append("goto ").append(lCond).append('\n');
      sc.code.b.append("lbl ").append(lCont).append('\n');
      SiStt.process(sc, c.t);
      sc.code.b.append("lbl ").append(lCond).append('\n');
      String cond = SiExpr.processBool(sc, c.c);
      sc.code.b.append("gotoT ").append(cond).append(' ').append(lCont).append('\n');
      return;
    }
    throw new ParseError("TODO SiStt::process "+stt.getClass(), stt);
  }
}
