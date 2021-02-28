package si.obj;

import org.antlr.v4.runtime.*;
import si.ParseError;
import si.gen.*;
import si.gen.SingeliParser.*;
import si.scope.*;
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
    sc.defs.put("goto", new DefDef.Dyn() {
      public SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tis, Token ref) {
        if (tis.size()!=1) throw new ParseError("Expected one deriving", ref);
        List<TexprContext> t = tis.get(0).texpr();
        if (t.size()!=1&&t.size()!=2) throw new ParseError("Expected 1 or 2 args to goto", ref);
        Def d = sc.dynDef(t.get(0));
        if (!(d instanceof LblDef)) throw new ParseError("Expected 1st arg of goto to be a label", ref);
        String lbl = ((LblDef) d).name;
        if (t.size()==1) sc.gotoA(lbl);
        else             sc.gotoT(SiExpr.processBool(sc, t.get(1).expr()), lbl);
        return SiExpr.VOID;
      }
    });
    sc.defs.put("label", new DefDef.Dyn() {
      public SiExpr.ProcRes exec(ChSc sc, List<TinvContext> tis, Token ref) {
        if (tis.size()!=1) throw new ParseError("Expected one deriving", ref);
        List<TexprContext> t = tis.get(0).texpr();
        if (t.size()!=1) throw new ParseError("Expected 1 or 2 args to goto", ref);
        Def d = sc.getDef(t.get(0).getText(), t.get(0).getStart());
        sc.lbl(((LblDef) d).name);
        return SiExpr.VOID;
      }
    });
    sc.defs.put("newLabel", new DefDef.Static() {
      public Def execConst(Sc sc, List<TinvContext> tis, Token ref) {
        if (tis.size()!=1) throw new ParseError("Expected one deriving", ref);
        List<TexprContext> t = tis.get(0).texpr();
        if (t.size()!=0) throw new ParseError("newLabel expected zero args", ref);
        if (!(sc instanceof ChSc)) throw new ParseError("Expected newLabel to be within a valid scope");
        return new LblDef(((ChSc) sc).ids.nextLbl());
      }
    });
    try {
      for (String f : arch.defs) addFile(f);
    } catch (IOException e) { throw new RuntimeException(e); }
    add = ((CallableDef.FnDef)sc.defs.get("__add")).f;
    sub = ((CallableDef.FnDef)sc.defs.get("__sub")).f;
    mul = ((CallableDef.FnDef)sc.defs.get("__mul")).f;
    div = ((CallableDef.FnDef)sc.defs.get("__div")).f;
    le = ((CallableDef.FnDef)sc.defs.get("__cmple")).f;
    lt = ((CallableDef.FnDef)sc.defs.get("__cmplt")).f;
    ge = ((CallableDef.FnDef)sc.defs.get("__cmpge")).f;
    gt = ((CallableDef.FnDef)sc.defs.get("__cmpgt")).f;
  }
  
  public void addFile(String path) throws IOException {
    add(new String(Files.readAllBytes(Paths.get(path))), path);
  }
  private boolean ok = true;
  public void add(String s, String path) {
    SingeliParser parser = new SingeliParser(new CommonTokenStream(new SingeliLexer(CharStreams.fromString(s))));
    SingeliParser.ProgContext prog = parser.prog();
    for (DefContext def : prog.def()) {
      SiDef d = new SiDef(def);
      Def wrq = sc.defs.computeIfAbsent(d.name, k -> new SiDef.DefWrap(sc, k));
      if (!(wrq instanceof SiDef.DefWrap)) throw new ParseError("Defining different constructs with the same name `"+d.name+"`", def);
      ((SiDef.DefWrap) wrq).alt(d);
    }
    
    for (FnContext fn : prog.fn()) {
      SiFn f = new SiFn(this, fn);
      CallableDef.FnDef def = (CallableDef.FnDef) sc.defs.computeIfAbsent(f.name, k -> new CallableDef.FnDef(new ArrayList<>(), f.name));
      def.f.add(f);
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
        SiFn.Derv d = SiFn.derv(fn(fn), sc, c.t, c.n);
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
    Def d = sc.getDefB(name);
    if (!(d instanceof CallableDef.FnDef)) throw new ParseError("Unknown function "+name);
    return ((CallableDef.FnDef) d).f;
  }
  
  private final StringBuilder ir = new StringBuilder();
  public void addFn(String s) {
    ir.append(s);
  }
  private int fnCtr = 0;
  public String nextFn() {
    return "d" + fnCtr++;
  }
}
