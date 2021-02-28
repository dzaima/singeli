package si.types;

public class LblDef extends Def {
  public final String name;
  public LblDef(String name) { this.name = name; }
  
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
