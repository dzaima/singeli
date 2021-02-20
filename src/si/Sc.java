package si;

import si.stt.SiExpr;
import si.types.*;
import si.types.num.*;
import si.types.ct.Const;
import si.types.num.Float;

import java.util.HashMap;

import static si.gen.SingeliParser.*;

public class Sc {
  public final SiProg prog;
  protected final HashMap<String, Def> defs;
  private final Sc p;
  
  public Sc(SiProg prog) {
    this.p = null;
    this.prog = prog;
    defs = new HashMap<>(Int.defTypes);
    defs.put("f32", Float.f32);
    defs.put("f64", Float.f64);
  }
  protected Sc(Sc p) {
    this.p = p;
    this.prog = p.prog;
    defs = new HashMap<>();
  }
  
  public SiFn getFn(String name) {
    return prog.fn(name);
  }
  
  public Def texpr(TexprContext te) {
    ExprContext expr = te.expr();
    if (expr!=null) return SiExpr.processDef(this, expr);
    throw new ParseError("TODO callable texpr");
  }
  public Type type(ExprContext e) {
    Def d = SiExpr.processDef(this, e);
    if (!(d instanceof Type)) throw new ParseError("Expected a type, got value", e);
    return (Type) d;
  }
  
  public Def getDef(String n) {
    Def def = defs.get(n);
    if (def==null) {
      if (p==null) throw new ParseError("Unknown type/constant "+n);
      return p.getDef(n);
    }
    return def;
  }
  
  public ChSc sub() {
    return new ChSc(this);
  }
  
  public Type var(String name) {
    Def def = defs.get(name);
    if (def!=null) {
      if (def instanceof Const) return ((Const) def).type(); // TODO take tk info arg
      return (Type) def;
    }
    if (p==null) throw new ParseError("Unknown variable "+name);
    return p.var(name);
  }
  
  public static class ChSc extends Sc {
    public ChSc(Sc p) { super(p); }
    public void addDef(String k, Def v) {
      defs.put(k, v);
    }
    HashMap<String, Type> vars = new HashMap<>();
    public void addVar(String k, Type t) {
      vars.put(k, t);
    }
    @Override public Type var(String name) {
      Type v = vars.get(name);
      if (v!=null) return v;
      return super.var(name);
    }
  }
}
