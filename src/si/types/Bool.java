package si.types;

public class Bool extends Type {
  public static final Bool u1 = new Bool();
  private Bool() { }
  
  public String toString() { return "u1"; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
