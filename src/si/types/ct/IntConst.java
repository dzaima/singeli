package si.types.ct;

import si.types.*;

public class IntConst extends Const {
  public long val;
  public Int type;
  
  public IntConst(long val, Int type) {
    this.val = val;
    this.type = type;
  }
  
  public Const add(Const r) {
    if (r instanceof IntConst && type==((IntConst) r).type) {
      return new IntConst((val + ((IntConst) r).val) & type.mask, type);
    }
    return super.add(r);
  }
  public Const mul(Const r) {
    if (r instanceof IntConst && type==((IntConst) r).type) {
      return new IntConst((val*((IntConst) r).val) & type.mask, type);
    }
    return super.add(r);
  }
  
  public Type type() {
    return type;
  }
  
  public String toString() { return val+":"+type; }
}
