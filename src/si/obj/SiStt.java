package si.obj;

import org.antlr.v4.runtime.tree.TerminalNode;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.ChSc;
import si.types.*;
import si.types.ct.IntConst;
import si.types.num.IntType;

import java.util.List;

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
      if (expr.id.startsWith("!")) { // TODO this should probably be done always
        String v = sc.ids.next();
        sc.b.append("new ").append(v).append(" val ").append(expr.t).append(' ').append(expr.id).append('\n');
        expr = new SiExpr.ProcRes(expr.t, v);
      }
      sc.addVar(c.k.getText(), expr);
      return;
    }
    if (stt instanceof MvarSttContext) {
      MvarSttContext c = (MvarSttContext) stt;
      SiExpr.ProcRes prev = sc.var(c.k.getText(), c.k);
      SiExpr.ProcRes curr = SiExpr.process(sc, c.v);
      if (!curr.t.castableTo(prev.t)) throw new ParseError("Cannot assign "+curr.t+" to "+prev.t, stt);
      sc.mut(prev.id, curr.id);
      return;
    }
    if (stt instanceof RetnSttContext) {
      SiExpr.ProcRes v = SiExpr.process(sc, ((RetnSttContext) stt).e);
      if (sc.ids.ret==null) sc.ids.ret = v.t;
      else if (!sc.ids.ret.equals(v.t)) throw new ParseError("Returning incorrect type "+v.t, stt.getStart());
      sc.b.append("ret ").append(v.id).append('\n');
      return;
    }
    if (stt instanceof BlockSttContext) {
      ChSc nsc = new ChSc(sc, 2);
      for (SttContext c : ((BlockSttContext) stt).stt()) SiStt.process(nsc, c);
      return;
    }
    if (stt instanceof IfSttContext) {
      IfSttContext c = (IfSttContext) stt;
      ExprContext e = c.c;
      String cond = SiExpr.processBool(sc, e);
  
      String lf = sc.ids.nextLbl();
      String lt = c.f==null? null : sc.ids.nextLbl();
      
      sc.gotoF(cond, lf);
      SiStt.process(sc, c.t);
      if (c.f!=null) sc.gotoA(lt);
      
      sc.lbl(lf);
      if (c.f!=null) {
        SiStt.process(sc, c.f);
        sc.lbl(lt);
      }
      return;
    }
    if (stt instanceof WhileSttContext) {
      WhileSttContext c = (WhileSttContext) stt;
      String lCont = sc.ids.nextLbl();
      String lCond = sc.ids.nextLbl();
      sc.gotoA(lCond);
      sc.lbl(lCont);
      SiStt.process(sc, c.t);
      sc.lbl(lCond);
      String cond = SiExpr.processBool(sc, c.c);
      sc.gotoT(cond, lCont);
      return;
    }
    if (stt instanceof ForSttContext) {
      ForSttContext c = (ForSttContext) stt;
      List<TerminalNode> ns = c.NAME();
      ChSc nsc = new ChSc(sc, 1);
  
      RTVal[] varVals = new RTVal[ns.size()];
      
      String iId = sc.ids.next();
      sc.b.append("undef ").append(iId).append(' ').append(IntType.u64).append('\n');
      String[] varIds = new String[varVals.length];
      
      for (int i = 0; i < ns.size(); i++) {
        TerminalNode node = ns.get(i);
        String name = node.getText();
        SiExpr.ProcRes p = sc.var(name, node.getSymbol());
        if (!(p.t instanceof PtrType)) throw new ParseError("Expected pointer argument to loop, got " + p.t, node);
        Type el = ((PtrType) p.t).item;
        varVals[i] = new RTVal(p);
        String nv = nsc.ids.next();
        varIds[i] = nv;
        sc.b.append("undef ").append(nv).append(' ').append(el).append('\n');
        nsc.addVar(name, new SiExpr.ProcRes(el, nv));
      }
      
      Def[][] ds = new Def[c.c.t==null?1:2][];
      if (c.c.t!=null) ds[0] = SiDef.evalDyn(sc, c.c.t);
      ds[ds.length-1] = new Def[]{
        c.s==null?IntConst.U64_0:new RTVal(SiExpr.process(sc, c.s)),
        new RTVal(SiExpr.process(sc, c.e)),
        new TupleDef(varVals),
        new BlockDef(c.b, nsc, iId, varIds)
      };
  
      Def def = sc.getDef(c.c.n.getText(), c.c.n);
      if (!(def instanceof SiDef.DefWrap)) throw new ParseError("Expected loop to be a def, got "+def, c.c.n);
      ((SiDef.DefWrap) def).exec(sc, ds, c.c.n);
      return;
    }
    if (stt instanceof ExecSttContext) {
      ExecSttContext c = (ExecSttContext) stt;
      
      
      Def d = SiExpr.processDef(sc, c.b); if (!(d instanceof BlockDef)) throw new ParseError("Expected 4th exec arg to be a block", c.b);
      BlockDef bd = (BlockDef) d;
      ChSc bsc = bd.sc;
      
      Def varsQ = SiExpr.processDef(sc, c.v); if (!(varsQ instanceof TupleDef)) throw new ParseError("Expected 3rd exec arg to be a tuple", c.v);
      RTVal[] vals = ((TupleDef) varsQ).vals;
      if (bd.varIds.length!=vals.length) throw new ParseError("Wrong number of exec vars", c.v);
      
      SiExpr.ProcRes ctr = SiExpr.process(sc, c.i);
      SiExpr.ProcRes off = SiExpr.process(sc, c.o);
      
      bsc.mut(bd.iId, ctr.id);
      String[] varIds = bd.varIds;
      for (int i = 0; i < varIds.length; i++) {
        SiExpr.ProcRes v = vals[i].v; if (!(v.t instanceof PtrType)) throw new ParseError("Expected pointer type", c.v);
        
        String nv = bsc.ids.next();
        bsc.b.append("new ").append(nv).append(" deref ").append(((PtrType) v.t).item).append(' ').append(v.id).append(' ').append(off.id).append('\n');
        bsc.mut(varIds[i], nv);
      }
      SiStt.process(bd.sc, bd.ctx);
      
      for (int i = 0; i < varIds.length; i++) {
        SiExpr.ProcRes v = vals[i].v;
        bsc.b.append("ins ").append(((PtrType) v.t).item).append(' ').append(v.id).append(' ').append(off.id).append(' ').append(varIds[i]).append('\n');
      }
      
      sc.b.append(bsc.b);
      bsc.b.delete(0, bsc.b.length());
      return;
    }
    // if (stt instanceof DefSttContext) {
    //   SiDef d = new SiDef(((DefSttContext) stt).d);
    //   Def wr = sc.defs.computeIfAbsent(d.name, k -> new SiDef.DefWrap(sc, k));
    //   if (!(wr instanceof SiDef.DefWrap)) throw new ParseError("Defining different constructs with the same name `"+d.name+"`", ((DefSttContext) stt).d.n);
    //   ((SiDef.DefWrap) wr).alt(d);
    //   return;
    // }
    if (stt instanceof DefSttContext) {
      DefSttContext c = (DefSttContext) stt;
      sc.defs.put(c.n.getText(), SiExpr.processDef(sc, c.v));
      return;
    }
    throw new ParseError("TODO SiStt::process "+stt.getClass(), stt);
  }
}
