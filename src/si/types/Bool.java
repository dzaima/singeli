package si.types;

import si.types.num.NumType;

public class Bool extends NumType {
  public static final Bool u1 = new Bool();
  private Bool() { super(1); }
  
  public String toString() { return "u1"; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
