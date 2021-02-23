package si.scope;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.obj.*;
import si.types.*;
import si.types.num.FloatType;
import si.types.num.*;

import java.util.HashMap;

import static si.gen.SingeliParser.*;

public class Sc {
  public final SiProg prog;
  public final HashMap<String, Def> defs;
  protected final Sc p;
  
  public Sc(SiProg prog) {
    this.p = null;
    this.prog = prog;
    defs = new HashMap<>(IntType.defTypes);
    defs.put("f32", FloatType.f32);
    defs.put("f64", FloatType.f64);
    defs.put("u1", Bool.u1);
    defs.put("void", VoidType.D);
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
    return new CallableDef.DervDef(getFn(c.NAME().getText(), te.getStart()).derv(this, c));
  }
  public Type type(ExprContext e) {
    Def d = SiExpr.processDef(this, e);
    if (!(d instanceof Type)) throw new ParseError("Expected a type, got "+d, e);
    return (Type) d;
  }
  public CallableDef getFn(String name, Token ref) {
    Def d = getDef(name, ref);
    if (d instanceof CallableDef) return (CallableDef) d;
    throw new ParseError(name+" was not a function");
  }
  
  public Def getDef(String name, Token ref) {
    Def def = defs.get(name);
    if (def==null) {
      if (p==null) throw new ParseError("Unresolved name "+name, ref);
      return p.getDef(name, ref);
    }
    return def;
  }
}
