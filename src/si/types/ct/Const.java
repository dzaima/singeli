package si.types.ct;

import si.ParseError;
import si.types.*;

public abstract class Const extends Def {
  public abstract Type type();
  public /*open*/ Const add(Const r) { throw new ParseError("Adding "+this+" and "+r); }
  public /*open*/ Const mul(Const r) { throw new ParseError("Multiplying "+this+" and "+r); }
}
