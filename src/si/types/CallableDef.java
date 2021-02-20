package si.types;

import si.*;
import si.gen.SingeliParser;

public abstract class CallableDef extends Def {
  public abstract SiFn.Derv derv(Sc sc, SingeliParser.CallableContext c);
  
  public static class FnDef extends CallableDef {
    public final SiFn f;
    public FnDef(SiFn f) {
      this.f = f;
    }
    public SiFn.Derv derv(Sc sc, SingeliParser.CallableContext c) {
      return f.derv(sc, c);
    }
  
    public String toString() { return f.name; }
    public boolean equals(Object o) {
      if (!(o instanceof FnDef)) return false;
      return f==((FnDef) o).f;
    }
    public int hashCode() { return f.hashCode()*1414213562; }
  }
  
  public static class DervDef extends CallableDef {
    public final SiFn.Derv d;
    public DervDef(SiFn.Derv d) {
      this.d = d;
    }
    public SiFn.Derv derv(Sc sc, SingeliParser.CallableContext c) {
      if (c.texpr().size()!=0) throw new ParseError("deriving an already derived function", c);
      return d;
    }
    public boolean equals(Object o) {
      if (!(o instanceof DervDef)) return false;
      return d==((DervDef) o).d;
    }
    public int hashCode() { return d.hashCode()*271828182; }
  }
}
