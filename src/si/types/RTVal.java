package si.types;

import si.obj.SiExpr;

public class RTVal extends Def {
  public final SiExpr.ProcRes v;
  
  public RTVal(SiExpr.ProcRes v) {
    this.v = v;
  }
  
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
