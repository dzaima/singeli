package si.types;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser.TinvContext;
import si.obj.SiExpr;
import si.scope.*;

import java.util.List;

public abstract class DefDef extends Def {
  public abstract SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tis, Token ref);
  
  public abstract boolean c();
  public abstract Def getConst();
  public abstract Def execConst(Sc sc, List<TinvContext> tis, Token ref);
  
  public abstract static class Static extends DefDef {
    public SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tis, Token ref) { throw new ParseError("This isn't dynamically invokable", ref); }
    public boolean c() { return false; }
    public Def getConst() { throw new IllegalStateException(); }
  }
  
  public abstract static class Dyn extends DefDef {
    public Def execConst(Sc sc, List<TinvContext> tis, Token ref) { throw new ParseError("This isn't statically invokable", ref); }
    public boolean c() { return false; }
    public Def getConst() { throw new IllegalStateException(); }
  }
  
  public boolean equals(Object o) { return this == o; }
  public int hashCode() { return System.identityHashCode(this); }
}
