package si.obj;

import si.gen.SingeliParser;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.Def;

import java.util.*;

public class SiTargs {
  public TargsContext t;
  public final int size;
  public final String[] targNames;
  public final ExprContext[] targSpec;
  public final List<TreqContext> treqs;
  
  public static final String[] NS = new String[0];
  public static final ExprContext[] NEC = new ExprContext[0];
  public static final List<TreqContext> NREQ = new ArrayList<>();
  public SiTargs(TargsContext t) {
    this.t = t;
    if (t==null) {
      size = 0;
      targNames = NS;
      targSpec = NEC;
      treqs = NREQ;
      return;
    }
    List<SingeliParser.TargContext> targs = t.targ();
    targNames = new String[targs.size()];
    targSpec = new SingeliParser.ExprContext[targs.size()];
    for (int i = 0; i < targs.size(); i++) {
      SingeliParser.TargContext ta = targs.get(i);
      targNames[i] = ta.name.getText();
      targSpec[i] = ta.spec;
    }
    treqs = t.treq();
    size = targNames.length;
  }
  
  @SuppressWarnings("BooleanMethodIsAlwaysInverted")
  public boolean derv(Sc p, ChSc nsc, List<Def> targTypes) {
    for (int i = 0; i < targTypes.size(); i++) {
      Def currD = targTypes.get(i);
      if (targSpec[i]!=null && !p.type(targSpec[i]).equals(currD)) return false;
      Def prevD = nsc.defs.put(targNames[i], currD);
      if (prevD!=null && !prevD.equals(currD)) return false;
    }
    for (TreqContext r : treqs) if (SiReq.bad(nsc, r)) return false;
    return true;
  }
}
