package si.obj;

import org.antlr.v4.runtime.*;
import si.ParseError;
import si.gen.*;
import si.scope.Sc;
import si.types.CallableDef;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class SiProg {
  public static final boolean COMMENTS = true;
  public final ArrayList<SiFn> add, mul;
  
  public SiProg(String archPath) {
    try {
      addFile(archPath);
    } catch (IOException e) { throw new RuntimeException(e); }
    add = fns.get("__add");
    mul = fns.get("__mul");
  }
  
  public final HashMap<String, ArrayList<SiFn>> fns = new HashMap<>();
  
  public void addFile(String path) throws IOException {
    add(new String(Files.readAllBytes(Paths.get(path))));
  }
  private boolean ok = true;
  public void add(String s) {
    SingeliParser.ProgContext prog = new SingeliParser(new CommonTokenStream(new SingeliLexer(CharStreams.fromString(s)))).prog();
    Sc sc = new Sc(this);
    for (SingeliParser.FnContext fn : prog.fn()) {
      SiFn f = new SiFn(this, fn);
      ArrayList<SiFn> alts = fns.computeIfAbsent(f.name, k -> new ArrayList<>());
      alts.add(f);
      sc.setDef(f.name, new CallableDef.FnDef(alts, f.name));
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
        SiFn.Derv d = SiFn.derv(fn(fn), sc, c);
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
  }
  
  public void finish() {
    System.out.println("\nresult:");
    System.out.println(ir.toString());
    if (!ok) System.exit(1);
  }
  
  public ArrayList<SiFn> fn(String name) {
    ArrayList<SiFn> f = fns.get(name);
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
