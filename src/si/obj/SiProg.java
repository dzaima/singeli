package si.obj;

import org.antlr.v4.runtime.*;
import si.ParseError;
import si.gen.*;
import si.gen.SingeliParser.*;
import si.scope.Sc;
import si.types.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class SiProg {
  public static final boolean COMMENTS = true;
  public final ArrayList<SiFn> add, sub, mul, div, le, lt, ge, gt;
  public final SiArch arch;
  public final Sc sc = new Sc(this);
  
  public SiProg(SiArch arch) {
    this.arch = arch;
    try {
      for (String f : arch.defs) addFile(f);
    } catch (IOException e) { throw new RuntimeException(e); }
    add = fns.get("__add");
    sub = fns.get("__sub");
    mul = fns.get("__mul");
    div = fns.get("__div");
    le = fns.get("__cmple");
    lt = fns.get("__cmplt");
    ge = fns.get("__cmpge");
    gt = fns.get("__cmpgt");
  }
  
  public final HashMap<String, ArrayList<SiFn>> fns = new HashMap<>();
  
  public void addFile(String path) throws IOException {
    add(new String(Files.readAllBytes(Paths.get(path))), path);
  }
  private boolean ok = true;
  public void add(String s, String path) {
    SingeliParser.ProgContext prog = new SingeliParser(new CommonTokenStream(new SingeliLexer(CharStreams.fromString(s)))).prog();
    for (DefContext def : prog.def()) {
      SiDef d = new SiDef(def);
      Def wrq = sc.defs.computeIfAbsent(d.name, k -> new SiDef.DefWrap(d.name));
      if (!(wrq instanceof SiDef.DefWrap)) throw new ParseError("Defining different constructs with the same name `"+d.name+"`", def);
      ((SiDef.DefWrap) wrq).alt(d);
    }
    
    for (FnContext fn : prog.fn()) {
      SiFn f = new SiFn(this, fn);
      ArrayList<SiFn> alts = fns.computeIfAbsent(f.name, k -> new ArrayList<>());
      alts.add(f);
      sc.defs.put(f.name, new CallableDef.FnDef(alts, f.name));
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
        ir.append("export ").append(d.id).append(' ').append(d.ret).append(' ').append(d.args.length);
        for (Type a : d.args) ir.append(' ').append(a);
        ir.append(' ').append(symb).append('\n');
        if (COMMENTS) ir.append('\n');
        symbols.put(symb, null);
        System.out.println("'"+symb+"' done");
      } catch (ParseError e) {
        if (lns==null) lns = s.split("\n");
        System.err.println("'"+symb+"': "+e.get(lns, path));
        ok = false;
      } catch (Throwable t) {
        t.printStackTrace();
        ok = false;
      }
    }
  }
  
  public String finish() {
    if (!ok) {
      System.out.println("\nincomplete IR:");
      System.out.println(ir.toString());
      System.exit(1);
    }
    return ir.toString();
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
    return "d" + fnCtr++;
  }
}
