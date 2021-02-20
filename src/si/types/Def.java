package si.types;

import si.ParseError;

public abstract class Def {
  public /*open*/ Def add(Def r) { throw new ParseError("Adding "+this+" and "+r); }
  public /*open*/ Def mul(Def r) { throw new ParseError("Multiplying "+this+" and "+r); }
  public abstract int hashCode();
  public abstract boolean equals(Object o);
}
