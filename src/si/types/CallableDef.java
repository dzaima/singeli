package si.types;

import si.*;
import si.gen.SingeliParser;
import si.obj.SiFn;
import si.scope.Sc;

import java.util.ArrayList;

public abstract class CallableDef extends Def {
  public abstract SiFn.Derv derv(Sc sc, SingeliParser.CallableContext c);
  
  public static class FnDef extends CallableDef {
    public final ArrayList<SiFn> f;
    public final String name;
    public FnDef(ArrayList<SiFn> f, String name) {
      this.f = f;
      this.name = name;
    }
    public SiFn.Derv derv(Sc sc, SingeliParser.CallableContext c) {
      return SiFn.derv(f, sc, c);
    }
  
    public String toString() { return name; }
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
      if (c.t.texpr().size()!=0) throw new ParseError("deriving an already derived function", c);
      return d;
    }
  
    public String toString() { return d.toString(); }
    public boolean equals(Object o) {
      if (!(o instanceof DervDef)) return false;
      return d==((DervDef) o).d;
    }
    public int hashCode() { return d.hashCode()*271828182; }
  }
}
