package si.scope;

import si.ParseError;
import si.obj.SiExpr;
import si.types.*;
import si.types.ct.Const;

import java.util.HashMap;

public class ChSc extends Sc {
  public static class Builder {
    public final StringBuilder b = new StringBuilder();
    public int varId = 0;
    
    public String next() {
      return "v" + varId++;
    }
  }
  public final Builder code;
  private final HashMap<String, SiExpr.ProcRes> vars = new HashMap<>();
  
  public ChSc(Sc p) {
    super(p);
    code = new Builder();
  }
  
  public ChSc(Sc p, Builder b) {
    super(p);
    code = b;
  }
  
  
  public void addVar(String k, SiExpr.ProcRes t) {
    vars.put(k, t);
  }
  
  public SiExpr.ProcRes var(String name) {
    SiExpr.ProcRes v = vars.get(name);
    if (v!=null) return v;
    
    Def d = defs.get(name);
    if (d!=null) if (d instanceof Const) return SiExpr.makeConst((Const) d);
    if (p instanceof ChSc) return ((ChSc) p).var(name);
    d = p.getDef(name);
    if (d instanceof Const) return SiExpr.makeConst((Const) d);
    throw new ParseError("Unknown variable "+name);
  }
}
