package si.ir.c;

import si.obj.SiArch;

public abstract class Target {
  public abstract String type(char bType, int w, int am, int ptrs); // bType: [uifv]
  public abstract SiArch arch();
  public abstract String headers();
  
  public static abstract class X86 extends Target {
    public String type(char bType, int w, int am, int ptrs) {
      if (am==-1) {
        String ptr = repeat('*', ptrs);
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
      }
      return null;
    }
    public String headers() {
      return
      "#include<stdint.h>\n"+
      "#include<stdbool.h>\n"+
      "static inline void si_aseti8 (int8_t * a, uint8_t  n, int8_t  k) { a[n]=k; }\n"+
      "static inline void si_aseti16(int16_t* a, uint64_t n, int16_t k) { a[n]=k; }\n"+
      "static inline void si_aseti32(int32_t* a, uint64_t n, int32_t k) { a[n]=k; }\n"+
      "static inline void si_aseti64(int64_t* a, uint64_t n, int64_t k) { a[n]=k; }\n"+
      "static inline int8_t  si_ageti8 (int8_t * a, uint64_t n) { return a[n]; }\n"+
      "static inline int16_t si_ageti16(int16_t* a, uint64_t n) { return a[n]; }\n"+
      "static inline int32_t si_ageti32(int32_t* a, uint64_t n) { return a[n]; }\n"+
      "static inline int64_t si_ageti64(int64_t* a, uint64_t n) { return a[n]; }\n";
    }
  }
  
  public static class SSE extends X86 {
    public String type(char bType, int w, int am, int ptrs) {
      String ptr = repeat('*', ptrs);
      if (am!=-1) {
        int sz = w*am;
        if (sz==128) return (bType=='f'? "__m128" : "__m128i") + ptr;
      }
      return super.type(bType, w, am, ptrs);
    }
    public SiArch arch() {
      return SiArch.SSE;
    }
  
    public String headers() {
      return super.headers()+"#include<xmmintrin.h>\n";
    }
  }
  private static String repeat(char c, int am) {
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < am; i++) b.append(c);
    return b.toString();
  }
}
