package si.types.ct;

import si.types.Type;
import si.types.num.FloatType;

public class F64Const extends Const {
  public double val;
  
  public F64Const(double val) {
    this.val = val;
  }
  
  public Type type() { return FloatType.f64; }
  
  public String lit() { return Double.toString(val); }
  public String toString() { return val+":f64"; }
  public int hashCode() { return (int)val*264575131; }
  public boolean equals(Object o) {
    if (!(o instanceof F64Const)) return false;
    F64Const t = (F64Const) o;
    return val==t.val;
  }
}
