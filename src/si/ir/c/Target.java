package si.ir.c;

import si.obj.SiArch;

public abstract class Target {
  public abstract String type(char bType, int w, int am, int ptrs); // bType: [uifv]
  public abstract SiArch arch();
  
  public static class SSE extends Target {
    public String type(char bType, int w, int am, int ptrs) {
      String ptr = repeat('*', ptrs);
      if (am!=-1) {
        int sz = w*am;
        if (sz==128) return (bType=='f'? "__m128" : "__m128i") + ptr;
        throw new Error("Unsupported type "+ptr+"["+am+"]"+bType+w);
      }
      if (bType=='f') {
        if (w == 32) return "float"+ptr;
        if (w == 64) return "double"+ptr;
      } else {
        String sgs = bType=='u'? "u" : "";
        if (w == 0) return "void"+ptr;
        if (w == 1 && bType=='u') return "bool"+ptr;
        if (w ==  8) return sgs+"int8_t" +ptr;
        if (w == 16) return sgs+"int16_t"+ptr;
        if (w == 32) return sgs+"int32_t"+ptr;
        if (w == 64) return sgs+"int64_t"+ptr;
      }
      throw new Error("Unsupported type "+bType+w);
    }
    public SiArch arch() {
      return SiArch.SSE;
    }
  }
  private static String repeat(char c, int am) {
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < am; i++) b.append(c);
    return b.toString();
  }
}
