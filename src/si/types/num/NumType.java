package si.types.num;

import si.types.Type;

public abstract class NumType extends Type {
  public final int w; // size in bits
  public NumType(int w) { this.w = w; }
}
