package si.scope;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser.TexprContext;
import si.obj.SiExpr;
import si.types.*;
import si.types.ct.Const;

import java.util.HashMap;

public class ChSc extends Sc {
  public static class Builder {
    public Type ret;
    
    public int varId = 0;
    public String next() { return "v" + varId++; }
    
    public int lblId = 0;
    public String nextLbl() { return "l" + lblId++; }
  }
  public final Builder ids;
  public final StringBuilder b;
  public void mut(String k, String v) { b.append("mut ").append(k).append(' ').append(v).append('\n'); }
  
  
  public final HashMap<String, SiExpr.ProcRes> vars = new HashMap<>();
  
  public ChSc(Sc p) {
    super(p);
    ids = new Builder();
    b = new StringBuilder();
  }
  
  public ChSc(ChSc p, int mode) { // 1:keep ids; 2:keep everything
    super(p);
    ids = p.ids;
    if (mode==2) {
      b = p.b;
    } else if (mode==1) {
      b = new StringBuilder();
    } else throw new Error();
  }
  public ChSc(ChSc p, StringBuilder b) { // just change the StringBuilder
    super(p);
    ids = p.ids;
    this.b = b;
  }
  
  
  public void addVar(String k, SiExpr.ProcRes t) {
    vars.put(k, t);
  }
  
  public SiExpr.ProcRes var(String name, Token ref) {
    SiExpr.ProcRes v = vars.get(name);
    if (v!=null) return v;
    
    Def d = defs.get(name);
    if (d==null) {
      if (p instanceof ChSc) return ((ChSc) p).var(name, ref);
      d = p.getDef(name, ref);
    }
    if (d instanceof Const) return SiExpr.makeConst((Const) d);
    if (d instanceof RTVal) return ((RTVal) d).v;
    throw new ParseError("Unknown variable "+name, ref);
  }
  public Def anyObj(String k, Token ref) {
    SiExpr.ProcRes v = vars.get(k);
    if (v!=null) return new RTVal(v);
    Def d = defs.get(k);
    if (d==null) {
      if (p instanceof ChSc) return ((ChSc) p).anyObj(k, ref);
      d = p.getDef(k, ref);
    }
    return d;
  }
  public Def dynDef(TexprContext e) {
    if (e.dyn!=null) return new RTVal(SiExpr.process(this, e.expr()));
    return constDef(e);
  }
}
