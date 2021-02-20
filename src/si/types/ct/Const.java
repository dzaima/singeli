package si.types.ct;

import si.types.*;

public abstract class Const extends Def {
  public abstract Type type();
  public /*open*/ Const add(Const r) { throw new Error("Adding "+this+" and "+r); }
  public /*open*/ Const mul(Const r) { throw new Error("Multiplying "+this+" and "+r); }
}
