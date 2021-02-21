package si.types.num;

public class Float extends Num {
  public static final Float f32 = new Float(32);
  public static final Float f64 = new Float(64);
  
  private Float(int w) { super(w); }
  
  public String toString() { return "f"+w; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
