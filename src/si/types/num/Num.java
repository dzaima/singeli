package si.types.num;

import si.types.Type;

public abstract class Num extends Type {
  public final int w; // size in bits
  public Num(int w) { this.w = w; }
}
