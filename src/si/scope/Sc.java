package si.scope;

import si.ParseError;
import si.obj.*;
import si.types.*;
import si.types.ct.Const;
import si.types.num.Float;
import si.types.num.*;

import java.util.HashMap;

import static si.gen.SingeliParser.*;

public class Sc {
  public final SiProg prog;
  protected final HashMap<String, Def> defs;
  protected final Sc p;
  
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
  
  
  public Def texpr(TexprContext te) {
    ExprContext expr = te.expr();
    if (expr!=null) return SiExpr.processDef(this, expr);
    CallableContext c = te.callable();
    return new CallableDef.DervDef(getFn(c.NAME().getText()).derv(this, c));
  }
  public Type type(ExprContext e) {
    Def d = SiExpr.processDef(this, e);
    if (!(d instanceof Type)) throw new ParseError("Expected a type, got "+d, e);
    return (Type) d;
  }
  public CallableDef getFn(String name) {
    Def d = getDef(name);
    if (d instanceof CallableDef) return (CallableDef) d;
    throw new ParseError(name+" was not a function");
  }
  
  public void setDef(String k, Def v) {
    defs.put(k, v);
  }
  public Def getDef(String name) {
    Def def = defs.get(name);
    if (def==null) {
      if (p==null) throw new ParseError("Unresolved name "+name);
      return p.getDef(name);
    }
    return def;
  }
}
