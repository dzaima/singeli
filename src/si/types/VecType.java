package si.types;

import si.ParseError;
import si.types.ct.IntConst;
import si.types.num.*;

public final class VecType extends Type {
  public static final int MAX_SIZE = Integer.MAX_VALUE;
  public final int am;
  public final NumType tp;
  public VecType(long am, NumType tp) {
    if (am >MAX_SIZE) throw new ParseError("Vector size "+ am +" too large");
    this.am = (int) am;
    this.tp = tp;
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof VecType)) return false;
    VecType t = (VecType) o;
    return am ==t.am && tp.equals(t.tp);
  }
  
  public Def mul(Def r) {
    Def ntp = tp.mul(r);
    if (!(ntp instanceof NumType)) return super.mul(r);
    if (tp==ntp) return this;
    return new VecType(am, tp);
  }
  
  public Def fld(String name) {
    if (name.equals("width")) return tp.fld(name);
    if (name.equals("size")) return new IntConst((long) tp.w*am, IntType.i32);
    if (name.equals("am")) return new IntConst(am, IntType.i32);
    return super.fld(name);
  }
  
  public String toString() {
    return "["+am+"]"+tp;
  }
  
  public int hashCode() {
    return 31*am + tp.hashCode() + 123456;
  }
}
