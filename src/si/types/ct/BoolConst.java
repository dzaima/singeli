package si.types.ct;

import si.types.*;

public class BoolConst extends Const {
  public final boolean b;
  private final String s;
  public static final BoolConst TRUE = new BoolConst(true);
  public static final BoolConst FALSE = new BoolConst(false);
  public static BoolConst bool(boolean b) { return b? TRUE : FALSE; }
  
  private BoolConst(boolean b) { this.b = b; s = Boolean.toString(b); }
  
  
  public Type type() { return Bool.u1; }
  
  public String toString() { return s; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
