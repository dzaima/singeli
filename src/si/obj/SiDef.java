package si.obj;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.ChSc;
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
  
  public static class DefWrap extends Def {
    public final String name;
    ArrayList<SiDef> ds = new ArrayList<>();
    
    public DefWrap(String name) {
      this.name = name;
    }
    
    public void alt(SiDef d) {
      ds.add(d);
    }
    
    public int hashCode() { return System.identityHashCode(this); }
    public boolean equals(Object o) { return this == o; }
    public String toString() { return name+":def"; }
  
    public SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tinv, Token ref) {
      for (SiDef c : ds) {
        SiExpr.ProcRes r = c.exec(sc, tinv);
        if (r!=null) return r;
      }
      throw new ParseError("No matching definition found", ref);
    }
  }
  
  public SiExpr.ProcRes exec(ChSc p, List<TinvContext> tinv) {
    if (tinv.size()!=t.length) return null;
    ChSc c = new ChSc(p, 1);
    for (int i = 0; i < t.length; i++) {
      SiTargs ct = t[i];
      TinvContext cc = tinv.get(i);
      List<TexprContext> es = cc.texpr();
      if (ct.size!=es.size()) return null;
      ChSc n = new ChSc(c, 2);
      ArrayList<Def> targTypes = new ArrayList<>(es.size());
      for (TexprContext e : es) targTypes.add(c.defRT(e));
      if (!ct.derv(c, n, targTypes)) return null;
      c = n;
    }
    for (SttContext stt : stts) SiStt.process(c, stt);
    SiExpr.ProcRes r = ret==null? SiExpr.VOID : SiExpr.process(c, ret);
    p.code.b.append(c.code.b);
    return r;
  }
}
