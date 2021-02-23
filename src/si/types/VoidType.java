package si.types;

public class VoidType extends Type {
  public static final VoidType D = new VoidType();
  
  public String toString() { return "void"; }
  public int hashCode() { return 0; }
  public boolean equals(Object o) { return this==o; }
}
