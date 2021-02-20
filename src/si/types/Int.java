package si.types;

import java.util.HashMap;

public final class Int extends Num {
  public final String name;
  public final int w;
  public final boolean signed;
  public final long mask;
  
  public Int(int w, boolean signed) {
    this.w = w;
    this.signed = signed;
    this.name = (signed? "i" : "u") + w;
    mask = w==64? -1L : (1L<<w)-1;
  }
  public String toString() { return name; }
  
  public static final HashMap<String, Int> defTypes = new HashMap<>();
  static {
    for (int i = 3; i < 7; i++) {
      Int s = new Int(1<<i, false); defTypes.put(s.name, s);
      Int e = new Int(1<<i, true ); defTypes.put(e.name, e);
    }
  }
  public static final Int i32 = defTypes.get("i32");
}
