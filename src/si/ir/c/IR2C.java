package si.ir.c;

import si.obj.*;
import si.types.Type;

import java.io.IOException;
import java.util.*;

public final class IR2C {
  private HashMap<String, ArrayList<Type>> fns = new HashMap<>();
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
    b.append('\n');
    
    String[] lns = pr.split("\n");
    int ln = 0;
    while (ln < lns.length) {
      i = 0; s = lns[ln++];
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
          boolean lbl = false;
          stts: while (true) {
            boolean lblP = lbl;
            lbl = false;
            if (ln >= lns.length) throw new Error("Unfinished function");
            i = 0; s = lns[ln++];
            String op1 = name();
            switch (op1) {
              case "ret":
                b.append("  return ").append(name()).append(";\n");
                break;
              case "gotoF":
                b.append("  if (!(").append(name()).append(")) ").append("goto ").append(name()).append(";\n");
                break;
              case "goto":
                b.append("  goto ").append(name()).append(";\n");
                break;
              case "lbl":
                lbl = true;
                b.append(name()).append(":\n");
                break;
              default:
                if (!name().equals("=")) throw new Error("Unknown operation: `"+s+"`");
                b.append("  ");
                String op2 = name();
                switch (op2) {
                  case "call": {
                    String fn = name();
                    String ty = type();
                    b.append(ty).append(' ').append(op1).append(" = ").append(rename(fn)).append('(');
                    int cAm = i32();
                    for (int j = 0; j < cAm; j++) {
                      if(j!=0) b.append(", ");
                      b.append(name());
                    }
                    b.append(')');
                    break;
                  }
                  case "emit": {
                    String ty = type();
                    String op3 = name();
                    boolean infix;
                    if (op3.equals("op")) {
                      op3 = name();
                      infix = true;
                    } else infix = false;
                    b.append(ty).append(' ').append(op1).append(" = ");
                    if (infix) {
                      b.append(name()).append(' ').append(op3).append(' ').append(name());
                    } else {
                      b.append(op3).append('(');
                      boolean first = true;
                      while (i<s.length()) {
                        String c = name();
                        if (c.isEmpty()) break;
                        if (first) first = false;
                        else b.append(", ");
                        b.append(c);
                      }
                      b.append(')');
                    }
                    break;
                  }
                  default: throw new Error("Unknown operation: `"+s+"`");
                }
                b.append(";\n");
                break;
              case "endFn":
                end();
                if (lblP) b.append("  ;\n"); // to make a trailing label happy
                break stts;
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
  private void end() { // TODO comments & whitespace
    for (int j = i; j < s.length(); j++) {
      char c = s.charAt(j);
      if (c=='#') return;
      if (c!=' ' & c!='\t') throw new Error("excessive IR line: `"+s+"`");
    }
  }
  private String name() {
    int p = s.indexOf(' ', i);
    String r;
    if (p==-1) p = s.length();
    r = s.substring(i, p);
    i = p+1;
    return r;
  }
  private String rename(String s) {
    return "si_"+s;
  }
  private String type() {
    String s = name();
    char c = s.charAt(0);
    int am;
    int i = 0;
    if (c=='[') {
      i = 2;
      while (s.charAt(i)!=']') { i++; if (i==s.length()) throw new Error("Bad type: `"+s+"`"); }
      am = Integer.parseInt(s.substring(1, i));
      i++;
      c = s.charAt(i);
    } else am = -1;
    int w = Integer.parseInt(s.substring(i+1));
    return arch.type(c, w, am);
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
