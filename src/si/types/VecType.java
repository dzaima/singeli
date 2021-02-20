package si.types;

import si.ParseError;
import si.types.num.Num;

public final class VecType extends Type {
  public static final int MAX_SIZE = Integer.MAX_VALUE;
  int sz;
  Num tp;
  public VecType(long sz, Num tp) {
    if (sz>MAX_SIZE) throw new ParseError("Vector size "+sz+" too large");
    this.sz = (int) sz;
    this.tp = tp;
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof VecType)) return false;
    VecType t = (VecType) o;
    return sz==t.sz && tp.equals(t.tp);
  }
  
  public Def mul(Def r) {
    Def ntp = tp.mul(r);
    if (!(ntp instanceof Num)) return super.mul(r);
    if (tp==ntp) return this;
    return new VecType(sz, tp);
  }
  
  public String toString() {
    return "["+sz+"]"+tp;
  }
  
  public int hashCode() {
    return 31*sz + tp.hashCode() + 123456;
  }
}
