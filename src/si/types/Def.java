package si.types;

import si.ParseError;

public abstract class Def {
  public /*open*/ Def add(Def r) { throw new ParseError("Adding "+this+" and "+r); }
  public /*open*/ Def sub(Def r) { throw new ParseError("Subtracting "+this+" and "+r); }
  public /*open*/ Def mul(Def r) { throw new ParseError("Multiplying "+this+" and "+r); }
  public /*open*/ Def div(Def r) { throw new ParseError("Dividing "+this+" by "+r); }
  
  public /*open*/ Def gt(Def r) { throw new ParseError("Comparing "+this+" and "+r); }
  public /*open*/ Def ge(Def r) { throw new ParseError("Comparing "+this+" and "+r); }
  
  public abstract int hashCode();
  public abstract boolean equals(Object o);
  
  public /*open*/ Def fld(String name) {
    return NoDef.D;
  }
  
  public static class NoDef extends Def {
    public static final NoDef D = new NoDef();
    public String toString() { return "<unknown>"; }
    public int hashCode() { return 0; }
    public boolean equals(Object o) { return false; }
  }
}
