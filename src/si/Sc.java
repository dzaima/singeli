package si;

import si.gen.SingeliParser;
import si.stt.SiExpr;
import si.types.*;
import si.types.Float;
import si.types.ct.*;

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
    TypeContext type = te.type();
    if (type!=null) {
      Type t = typeM(type);
      if (t!=null) return t;
      throw new ParseError("TODO fallback expr evaluation of type", te);
    }
    return SiExpr.processConst(this, te.expr());
  }
  private Type typeM(TypeContext tc) { // TODO make sure this properly returns null
    if (tc instanceof NameContext) {
      Def def = getDef(((NameContext) tc).NAME().getText());
      if (!(def instanceof Type)) return null;
      return (Type) def;
    }
    if (tc instanceof VecContext) {
      VecContext c = (VecContext) tc;
      Def d = getDef(c.NAME().getText());
      if (!(d instanceof Num)) throw new ParseError("Expected vector element type to be a number, was "+d, c);
      Const v = SiExpr.processConst(this, c.expr());
      if (!(v instanceof IntConst)) throw new ParseError("Expected vector element type to be a number, got ["+v+"]"+d, c);
      return new VecType(((IntConst) v).val, (Num) d);
    }
    if (tc instanceof MulContext) {
      MulContext c = (MulContext) tc;
      int mul = Integer.parseInt(c.INT().getText());
      Type elType = typeM(c.type());
      if (elType==null) return null;
      return elType.mul(mul, c.getStart());
    }
    if (tc instanceof PtrContext) {
      PtrContext c = (PtrContext) tc;
      Type elType = typeM(c.type());
      if (elType==null) return null;
      return new PtrType(elType);
    }
    throw new ParseError("TODO Sc::typeM "+tc.getClass(), tc);
  }
  public Type type(TypeContext tc) {
    Type t = typeM(tc);
    if (t==null) throw new ParseError("Expected type, got constant value", tc);
    return t;
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
    if (def!=null) if (def instanceof Const) return ((Const) def).type();
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
