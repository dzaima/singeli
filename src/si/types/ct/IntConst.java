package si.types.ct;

import si.types.*;
import si.types.num.Int;

public class IntConst extends Const {
  public long val;
  public Int type;
  
  public IntConst(long val, Int type) {
    this.val = val;
    this.type = type;
  }
  
  public Def add(Def r) {
    if (r instanceof IntConst && type==((IntConst) r).type) {
      return new IntConst((val + ((IntConst) r).val) & type.mask, type);
    }
    return super.add(r);
  }
  public Def mul(Def r) {
    if (r instanceof IntConst && type==((IntConst) r).type) {
      return new IntConst((val*((IntConst) r).val) & type.mask, type);
    }
    if (r instanceof Int || r instanceof VecType) return r.mul(this);
    return super.add(r);
  }
  
  public Type type() {
    return type;
  }
  
  public String toString() { return val+":"+type; }
  public int hashCode() { return type.hashCode()+(int)val*1732050807; }
  public boolean equals(Object o) {
    if (!(o instanceof IntConst)) return false;
    IntConst t = (IntConst) o;
    return t.type.equals(type) && val==t.val;
  }
}
