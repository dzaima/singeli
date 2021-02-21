package si.types.num;

import si.ParseError;
import si.types.Def;
import si.types.ct.*;

import java.util.HashMap;

public final class IntType extends NumType {
  public final String name;
  public final int wl; // width log - 3,4,5,6
  public final boolean signed;
  public final long mask;
  
  public IntType(int wl, boolean signed) {
    super(1<<wl);
    this.wl = w;
    this.signed = signed;
    this.name = (signed? "i" : "u") + w;
    mask = w==64? -1L : (1L<<w)-1;
  }
  
  public static final HashMap<String, IntType> defTypes = new HashMap<>();
  public static final IntType[][] types = new IntType[2][4];
  static {
    for (int i = 3; i < 7; i++) {
      IntType u = new IntType(i, false); defTypes.put(u.name, u); types[0][i-3] = u;
      IntType s = new IntType(i, true ); defTypes.put(s.name, s); types[1][i-3] = s;
    }
  }
  public static final IntType i32 = defTypes.get("i32");
  
  public Def mul(Def r) {
    if (!(r instanceof IntConst && ((IntConst) r).type.w<=32)) return super.mul(r);
    int mul = (int) ((IntConst) r).val;
    int nw = w*mul;
    if (nw<8 | nw>64 | (nw&(nw-1))!=0) throw new ParseError("Cannot multiply "+this+" by "+mul); // TODO tk info
    int nwl = Integer.bitCount(nw-1);
    return types[signed?1:0][nwl-3];
  }
  
  public Def fld(String name) {
    if (name.equals("width")) return new IntConst(w, i32);
    if (name.equals("int")) return BoolConst.TRUE;
    if (name.equals("signed")) return BoolConst.bool(signed);
    if (name.equals("unsigned")) return BoolConst.bool(!signed);
    return super.fld(name);
  }
  
  public String toString() { return name; }
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return this==o; }
}
