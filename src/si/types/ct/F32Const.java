package si.types.ct;

import si.types.*;
import si.types.num.*;

public class F32Const extends Const {
  public float val;
  
  public F32Const(float val) {
    this.val = val;
  }
  
  public Type type() { return FloatType.f32; }
  
  public String lit() { return Float.toString(val); }
  public String toString() { return val+":f32"; }
  public int hashCode() { return (int)val*244948974; }
  public boolean equals(Object o) {
    if (!(o instanceof F32Const)) return false;
    F32Const t = (F32Const) o;
    return val==t.val;
  }
}
