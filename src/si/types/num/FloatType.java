package si.types.num;

public class FloatType extends NumType {
  public static final FloatType f32 = new FloatType(32);
  public static final FloatType f64 = new FloatType(64);
  
  private FloatType(int w) { super(w); }
  
  public String toString() { return "f"+w; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
