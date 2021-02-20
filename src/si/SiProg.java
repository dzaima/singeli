package si;

import org.antlr.v4.runtime.*;
import si.gen.*;

import java.util.HashMap;

public class SiProg {
  public final HashMap<String, SiFn> fns = new HashMap<>();
  public SiProg(String s) {
    boolean ok = true;
    SingeliParser.ProgContext prog = new SingeliParser(new CommonTokenStream(new SingeliLexer(CharStreams.fromString(s)))).prog();
    for (SingeliParser.FnContext fn : prog.fn()) {
      SiFn f = new SiFn(this, fn);
      fns.put(f.name, f);
    }
    HashMap<String, Void> symbols = new HashMap<>();
    String[] lns = null;
    for (SingeliParser.ExportContext exp : prog.export()) {
      String symb = exp.SYMB().getText();
      symb = symb.substring(1, symb.length()-1);
      try {
        if (symbols.containsKey(symb)) throw new ParseError("Defining symbol "+symb+" twice", exp.SYMB());
        String fn = exp.NAME().getText();
        Sc sc = new Sc();
        fn(fn).derv(sc, exp.targExpr().texpr(), exp.targExpr().getStart());
        symbols.put(symb, null);
      } catch (ParseError e) {
        if (lns==null) lns = s.split("\n");
        System.err.println("In '"+symb+"': "+e.get(lns));
      } catch (Throwable t) {
        System.err.println("In '"+symb+"': "+t.getMessage());
        ok = false;
      }
    }
    if (!ok) System.exit(1);
  }
  
  private SiFn fn(String name) {
    SiFn f = fns.get(name);
    if (f==null) throw new ParseError("Unknown fn "+name);
    return f;
  }
}
