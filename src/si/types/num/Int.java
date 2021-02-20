package si.types.num;

import si.ParseError;
import si.types.Def;
import si.types.ct.IntConst;

import java.util.HashMap;

public final class Int extends Num {
  public final String name;
  public final int w; // width - 8,16,32,64
  public final int wl; // width log - 3,4,5,6
  public final boolean signed;
  public final long mask;
  
  public Int(int wl, boolean signed) {
    this.w = 1<<wl;
    this.wl = w;
    this.signed = signed;
    this.name = (signed? "i" : "u") + w;
    mask = w==64? -1L : (1L<<w)-1;
  }
  public String toString() { return name; }
  
  public static final HashMap<String, Int> defTypes = new HashMap<>();
  public static final Int[][] types = new Int[2][4];
  static {
    for (int i = 3; i < 7; i++) {
      Int u = new Int(i, false); defTypes.put(u.name, u); (types[0])[i-3] = u;
      Int s = new Int(i, true ); defTypes.put(s.name, s); (types[1])[i-3] = s;
    }
  }
  public static final Int i32 = defTypes.get("i32");
  
  public Def mul(Def r) {
    if (!(r instanceof IntConst && ((IntConst) r).type.w<=32)) return super.mul(r);
    int mul = (int) ((IntConst) r).val;
    int nw = w*mul;
    if (nw<8 | nw>64 | (nw&(nw-1))!=0) throw new ParseError("Cannot multiply "+this+" by "+mul); // TODO tk info
    int nwl = Integer.bitCount(nw-1);
    return types[signed?1:0][nwl-3];
  }
}
