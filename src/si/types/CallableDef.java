package si.types;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.obj.SiFn;
import si.scope.Sc;

import java.util.*;

public abstract class CallableDef extends Def {
  public abstract SiFn.Derv derv(Sc sc, TinvContext t, Token ref);
  
  public static class FnDef extends CallableDef {
    public final ArrayList<SiFn> f;
    public final String name;
    public FnDef(ArrayList<SiFn> f, String name) {
      this.f = f;
      this.name = name;
    }
    public SiFn.Derv derv(Sc sc, TinvContext t, Token ref) {
      return SiFn.derv(f, sc, t, ref);
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
    public SiFn.Derv derv(Sc sc, TinvContext t, Token ref) {
      if (t!=null && t.texpr().size()!=0) throw new ParseError("deriving an already derived function", ref);
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
