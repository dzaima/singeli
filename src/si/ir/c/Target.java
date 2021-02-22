package si.ir.c;

import si.obj.SiArch;

public abstract class Target {
  public abstract String type(char bType, int w, int am); // bType: [uif]
  public abstract SiArch arch();
  
  public static class SSE extends Target {
    public String type(char bType, int w, int am) {
      if (am!=-1) {
        int sz = w*am;
        if (sz==128) return bType=='f'? "__m128" : "__m128i";
        throw new Error("Unsupported type ["+am+"]"+bType+w);
      }
      if (bType=='f') {
        if (w == 32) return "float";
        if (w == 64) return "double";
      } else {
        String sgs = bType==0? "u" : "";
        if (w == 1 && bType==0) return "bool";
        if (w == 8) return sgs + "int8_t";
        if (w == 16) return sgs + "int16_t";
        if (w == 32) return sgs + "int32_t";
        if (w == 64) return sgs + "int64_t";
      }
      throw new Error("Unsupported type "+bType+w);
    }
    public SiArch arch() {
      return SiArch.SSE;
    }
  }
}
