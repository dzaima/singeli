package si.obj;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.*;

import java.util.*;

public class SiDef {
  public final DefContext ctx;
  public final String name;
  public final List<SttContext> stts;
  public final ExprContext ret;
  public final SiTargs[] t;
  
  public SiDef(DefContext d) {
    name = d.n.getText();
    stts = d.stt();
    ret = d.retV;
    ctx = d;
    List<TargsContext> tl = d.targs();
    t = new SiTargs[tl.size()];
    for (int i = 0; i < t.length; i++) t[i] = new SiTargs(tl.get(i));
  }
  
  private ChSc step(Def[] targs, ChSc c, int i) {
    SiTargs ct = t[i];
    if (ct.size != targs.length) return null;
    ChSc n = new ChSc(c, 2);
    if (!ct.derv(c, n, targs)) return null;
    return n;
  }
  public SiExpr.ProcRes exec(ChSc p, Def[][] allTargs) {
    if (allTargs.length!=t.length) return null;
    ChSc c = new ChSc(p, 1);
    for (int i = 0; i < t.length; i++) {
      c = step(allTargs[i], c, i);
      if (c == null) return null;
    }
    for (SttContext stt : stts) SiStt.process(c, stt);
    SiExpr.ProcRes r = ret==null? SiExpr.VOID : SiExpr.process(c, ret);
    p.b.append(c.b);
    return r;
  }
  public static Def[] evalDyn(ChSc c, TinvContext t) {
    List<TexprContext> es = t.texpr();
    Def[] r = new Def[es.size()];
    for (int i = 0; i < es.size(); i++) r[i] = c.dynDef(es.get(i));
    return r;
  }
  public SiExpr.ProcRes exec(ChSc p, List<TinvContext> tinv) {
    if (tinv.size()!=t.length) return null;
    ChSc c = new ChSc(p, 1);
    for (int i = 0; i < t.length; i++) {
      c = step(evalDyn(c, tinv.get(i)), c, i);
      if (c==null) return null;
    }
    for (SttContext stt : stts) SiStt.process(c, stt);
    SiExpr.ProcRes r = ret==null? SiExpr.VOID : SiExpr.process(c, ret);
    p.b.append(c.b);
    return r;
  }
  
  
  public Def execConst(Sc p, List<TinvContext> tinv) {
    if (tinv.size()!=t.length) return null;
    if (ret==null) return null;
    if (stts.size()!=0) return null;
    WrSc c = new WrSc(p);
    for (int i = 0; i < t.length; i++) {
      SiTargs ct = t[i];
      Def[] targTypes = evalConst(c, tinv.get(i));
      if (ct.size!=targTypes.length) return null;
      WrSc n = new WrSc(c);
      if (!ct.derv(c, n, targTypes)) return null;
      c = n;
    }
    return SiExpr.processDef(c, ret);
  }
  
  public static Def[] evalConst(Sc c, TinvContext cc) {
    List<TexprContext> es = cc.texpr();
    Def[] targTypes = new Def[es.size()];
    for (int j = 0; j < es.size(); j++) targTypes[j] = c.constDef(es.get(j));
    return targTypes;
  }
  
  public static class DefWrap extends DefDef {
    private final Sc sc;
    public final String name;
    ArrayList<SiDef> ds = new ArrayList<>();
    
    public DefWrap(Sc sc, String name) {
      this.sc = sc;
      this.name = name;
    }
    
    public void alt(SiDef d) {
      ds.add(d);
    }
    
    public String toString() { return name+":def"; }
  
    public SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tinv, Token ref) {
      for (SiDef c : ds) {
        SiExpr.ProcRes r = c.exec(sc, tinv);
        if (r!=null) return r;
      }
      throw new ParseError("No matching definition found", ref);
    }
    public SiExpr.ProcRes exec(ChSc sc, Def[][] allTargs, Token ref) {
      for (SiDef c : ds) {
        SiExpr.ProcRes r = c.exec(sc, allTargs);
        if (r!=null) return r;
      }
      throw new ParseError("No matching definition found", ref);
    }
    public Def execConst(Sc sc, List<TinvContext> tinv, Token ref) {
      for (SiDef c : ds) {
        Def r = c.execConst(sc, tinv);
        if (r!=null) return r;
      }
      throw new ParseError("No matching definition found", ref);
    }
  
    public boolean c() {
      if (ds.size()!=1) return false;
      SiDef d0 = ds.get(0);
      return d0.t.length==0 && d0.stts.size()==0 && d0.ret!=null;
    }
    
    private Def val;
    public Def getConst() {
      if (val!=null) return val;
      return val = SiExpr.processDef(sc, ds.get(0).ret);
    }
  }
}
