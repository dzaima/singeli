package si.ir.c;

import si.obj.SiProg;

import java.io.IOException;

public final class IR2C {
  private StringBuilder b = new StringBuilder();
  private final Target arch;
  private IR2C(Target arch) {
    this.arch = arch;
  }
  
  public static String parse(Target t, String s) {
    IR2C g = new IR2C(t);
    g.parse(s);
    return g.b.toString();
  }
  
  public void parse(String pr) {
    b.append("#include<stdint.h>\n");
    b.append("#include<stdbool.h>\n");
    b.append("#include<xmmintrin.h>\n");
    b.append("static inline void si_aseti8 (int8_t * a, uint8_t  n, int8_t  k) { a[n]=k; }\n");
    b.append("static inline void si_aseti16(int16_t* a, uint64_t n, int16_t k) { a[n]=k; }\n");
    b.append("static inline void si_aseti32(int32_t* a, uint64_t n, int32_t k) { a[n]=k; }\n");
    b.append("static inline void si_aseti64(int64_t* a, uint64_t n, int64_t k) { a[n]=k; }\n");
    b.append("static inline int8_t  si_ageti8 (int8_t * a, uint64_t n) { return a[n]; }\n");
    b.append("static inline int16_t si_ageti16(int16_t* a, uint64_t n) { return a[n]; }\n");
    b.append("static inline int32_t si_ageti32(int32_t* a, uint64_t n) { return a[n]; }\n");
    b.append("static inline int64_t si_ageti64(int64_t* a, uint64_t n) { return a[n]; }\n");
    b.append('\n');
    
    String[] lns = pr.split("\n");
    int ln = 0;
    while (ln < lns.length) {
      i = 0; s = lns[ln++];
      if (s.length()==0) continue;
      switch (name()) {
        case "": {
          end();
          break;
        }
        case "beginFn": {
          String n = name();
          String ret = type();
          b.append("static ");
          b.append(ret).append(' ').append(rename(n)).append('(');
          int argc = i32();
          for (int j = 0; j < argc; j++) {
            if (j!=0) b.append(", ");
            b.append(type()).append(" v").append(j);
          }
          end();
          b.append(") {\n");
          stts: while (true) {
            if (ln >= lns.length) throw new Error("Unfinished function");
            i = 0; s = lns[ln++];
            String op1 = name();
            switch (op1) {
              case "ret":
                String retv = lit();
                if (ret.equals("void")) b.append("  return;\n");
                else b.append("  return ").append(retv).append(";\n");
                break;
              case "gotoF":
                b.append("  if (!(").append(lit()).append(")) ").append("goto ").append(name()).append(";\n");
                break;
              case "gotoT":
                b.append("  if (").append(lit()).append(") ").append("goto ").append(name()).append(";\n");
                break;
              case "goto":
                b.append("  goto ").append(name()).append(";\n");
                break;
              case "lbl":
                b.append(name()).append(":;\n");
                break;
              case "new":
                b.append("  ");
                String name = name();
                String op2 = name();
                String ty = type();
                if (!ty.equals("void")) b.append(ty).append(' ').append(name).append(" = ");
                switch (op2) {
                  case "call": {
                    String fn = name();
                    b.append(rename(fn)).append('(');
                    int cAm = i32();
                    for (int j = 0; j < cAm; j++) {
                      if(j!=0) b.append(", ");
                      b.append(lit());
                    }
                    b.append(')');
                    break;
                  }
                  case "emit": {
                    String op3 = name();
                    boolean infix;
                    if (op3.equals("op")) {
                      op3 = name();
                      infix = true;
                    } else infix = false;
                    if (infix) {
                      b.append(lit()).append(' ').append(op3).append(' ').append(lit());
                    } else {
                      b.append(op3).append('(');
                      boolean first = true;
                      while (i<s.length()) {
                        String c = lit();
                        if (c.isEmpty()) break;
                        if (first) first = false;
                        else b.append(", ");
                        b.append(c);
                      }
                      b.append(')');
                    }
                    break;
                  }
                  case "val": {
                    String val = lit();
                    b.append(val);
                    break;
                  }
                  default: throw new Error("Unknown operation: `"+s+"`");
                }
                b.append(";\n");
                break;
              case "endFn":
                end();
                break stts;
              case "mut":
                String k = name();
                String v = lit();
                b.append("  ").append(k).append(" = ").append(v).append(";\n");
                break;
              default: throw new Error("Unknown operation: `"+s+"`");
            }
            end();
          }
          b.append("}\n\n");
          break;
        }
        case "export": {
          String val = name();
          String ret = type();
          int am = i32();
          String[] args = new String[am];
          for (int j = 0; j < am; j++) args[j] = type();
          String exp = rest();
          b.append(ret).append(' ').append(exp).append('(');
          for (int j = 0; j < args.length; j++) {
            if (j!=0) b.append(',');
            b.append(args[j]).append(' ').append('v').append(j);
          }
          b.append(") { return ").append(rename(val)).append('(');
          for (int j = 0; j < args.length; j++) b.append(j==0?"":",").append('v').append(j);
          b.append("); }\n\n");
          break;
        }
        default: throw new Error("Unknown operation in `"+s+"`");
      }
    }
  }
  
  
  private String s;
  private int i;
  private void end() {
    for (int j = i; j < s.length(); j++) {
      char c = s.charAt(j);
      if (c=='#') return;
      if (c!=' ' & c!='\t') throw new Error("excessive IR line: `"+s+"`");
    }
  }
  private String name() {
    if (i >= s.length()) throw new Error("Unfinished line: `"+s+"`");
    int p = s.indexOf(' ', i);
    String r;
    if (p==-1) p = s.length();
    r = s.substring(i, p);
    i = p+1;
    return r;
  }
  private String lit() {
    String s = name();
    if (s.charAt(0)=='!') {
      int p = s.indexOf(':');
      if (p<1) throw new Error("Invalid literal `"+s+"`");
      String val = s.substring(1, p);
      String ty = type(s.substring(p+1));
      return "(("+ty+")"+val+(s.charAt(p+1)=='u'?"ull" : "ll")+")";
    }
    return s;
  }
  private String rename(String s) {
    return "si_"+s;
  }
  private String type() {
    String s = name();
    return type(s);
  }
  private String type(String s) {
    char c = s.charAt(0);
    int am;
    int i = 0;
    while (c=='*') { i++; c = s.charAt(i); }
    int ptrs = i;
    if (c=='[') {
      i += 2;
      while (s.charAt(i)!=']') { i++; if (i==s.length()) throw new Error("Bad type: `"+s+"`"); }
      am = Integer.parseInt(s.substring(ptrs+1, i));
      i++;
      c = s.charAt(i);
    } else am = -1;
    if (c=='v' && s.equals("void")) return arch.type('v',0,-1, ptrs);
    int w = Integer.parseInt(s.substring(i+1));
    return arch.type(c, w, am, ptrs);
  }
  
  private String rest() {
    String r = s.substring(i);
    i = r.length();
    return r;
  }
  private int i32() {
    return Integer.parseInt(name());
  }
  
  public static void main(String[] args) {
    try {
      Target t = new Target.SSE();
      SiProg p = new SiProg(t.arch());
      p.addFile("tests/test.singeli");
      String ir = p.finish();
      System.out.println("IR:");
      System.out.println(ir);
      System.out.println();
      String s = parse(t, ir);
      System.out.println("Generated:");
      System.out.println(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
