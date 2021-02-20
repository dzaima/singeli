package si.types;

import si.ParseError;

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
  
  public String toString() {
    return "["+sz+"]"+tp;
  }
}
