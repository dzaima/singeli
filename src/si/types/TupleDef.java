package si.types;

public class TupleDef extends Def {
  public final RTVal[] vals;
  public TupleDef(RTVal[] vals) {
    this.vals = vals;
  }
  
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
  public String toString() {
    StringBuilder b = new StringBuilder();
    b.append("![");
    for (int i = 0; i < vals.length; i++) {
      if (i!=0) b.append(",");
      b.append(vals[i]);
    }
    b.append("]");
    return b.toString();
  }
}
