package si.types;

public class Float extends Num {
  public final int w;
  private Float(int w) {
    this.w = w;
  }
  
  public static final Float f32 = new Float(32);
  public static final Float f64 = new Float(64);
  
  public String toString() {
    return "f"+w;
  }
}
