package si.types.ct;

import si.types.*;
import si.types.num.IntType;

public class IntConst extends Const {
  public long val;
  public IntType type;
  
  public IntConst(long val, IntType type) {
    this.val = val;
    this.type = type;
  }
  
  public Def add(Def r) {
    if (match(r)) return new IntConst((val+((IntConst) r).val) & type.max_u, type);
    return super.add(r);
  }
  public Def sub(Def r) {
    if (match(r)) return new IntConst((val-((IntConst) r).val) & type.max_u, type);
    return super.sub(r);
  }
  public Def mul(Def r) {
    if (match(r)) return new IntConst((val*((IntConst) r).val) & type.max_u, type);
    if (r instanceof IntType || r instanceof VecType) return r.mul(this);
    return super.mul(r);
  }
  public Def div(Def r) {
    if (match(r)) return new IntConst((val/((IntConst) r).val) & type.max_u, type);
    return super.div(r);
  }
  public Def gt(Def r) {
    if (r instanceof IntConst && type.signed && ((IntConst) r).type.signed) return BoolConst.bool(val >  ((IntConst) r).val);
    return super.gt(r);
  }
  public Def ge(Def r) {
    if (r instanceof IntConst && type.signed && ((IntConst) r).type.signed) return BoolConst.bool(val >= ((IntConst) r).val); // TODO unsigned
    return super.ge(r);
  }
  private boolean match(Def r) {
    return r instanceof IntConst && type == ((IntConst) r).type;
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
