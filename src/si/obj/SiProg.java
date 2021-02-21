package si.obj;

import org.antlr.v4.runtime.*;
import si.*;
import si.gen.*;
import si.scope.Sc;
import si.types.CallableDef;

import java.util.HashMap;

public class SiProg {
  public static final boolean COMMENTS = false;
  public final HashMap<String, SiFn> fns = new HashMap<>();
  public SiProg(String s) {
    boolean ok = true;
    SingeliParser.ProgContext prog = new SingeliParser(new CommonTokenStream(new SingeliLexer(CharStreams.fromString(s)))).prog();
    Sc sc = new Sc(this);
    for (SingeliParser.FnContext fn : prog.fn()) {
      SiFn f = new SiFn(this, fn);
      fns.put(f.name, f);
      sc.addDef(f.name, new CallableDef.FnDef(f));
    }
    
    HashMap<String, Void> symbols = new HashMap<>();
    String[] lns = null;
    for (SingeliParser.ExportContext exp : prog.export()) {
      String symb = exp.SYMB().getText();
      symb = symb.substring(1, symb.length()-1);
      try {
        if (symbols.containsKey(symb)) throw new ParseError("Defining symbol "+symb+" twice", exp.SYMB());
        SingeliParser.CallableContext c = exp.callable();
        String fn = c.NAME().getText();
        SiFn.Derv d = fn(fn).derv(sc, c);
        ir.append("export ").append(d.id).append(' ').append(symb).append('\n');
        symbols.put(symb, null);
        System.out.println("'"+symb+"' done");
      } catch (ParseError e) {
        if (lns==null) lns = s.split("\n");
        System.err.println("'"+symb+"': "+e.get(lns));
        ok = false;
      } catch (Throwable t) {
        t.printStackTrace();
        ok = false;
      }
    }
    System.out.println("\nresult:");
    System.out.println(ir.toString());
    if (!ok) System.exit(1);
  }
  
  public SiFn fn(String name) {
    SiFn f = fns.get(name);
    if (f==null) throw new ParseError("Unknown fn "+name);
    return f;
  }
  
  private StringBuilder ir = new StringBuilder();
  public void addFn(String s) {
    ir.append(s);
  }
  private int fnCtr = 0;
  public String nextFn() {
    return "f" + fnCtr++;
  }
}
