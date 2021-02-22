package si.types.num;

import si.types.Def;
import si.types.ct.*;

public class FloatType extends NumType {
  public static final FloatType f32 = new FloatType(32);
  public static final FloatType f64 = new FloatType(64);
  
  private FloatType(int w) { super(w); }
  
  public Def fld(String name) {
    if (name.equals("width")) return new IntConst(w, IntType.i32);
    if (name.equals("num")) return BoolConst.TRUE;
    if (name.equals("float")) return BoolConst.TRUE;
    return super.fld(name);
  }
  
  public String toString() { return "f"+w; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
