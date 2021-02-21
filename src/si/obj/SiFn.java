package si.obj;

import org.antlr.v4.runtime.Token;
import si.*;
import si.scope.*;
import si.types.*;

import java.util.*;

import static si.gen.SingeliParser.*;

public class SiFn {
  public final SiProg p;
  public final String name;
  public final String[] targNames;
  
  public final String[] argNames;
  public final ExprContext[] argTypes;
  
  private final FnContext ctx;
  private final List<TreqContext> treqs;
  
  public SiFn(SiProg p, FnContext ctx) {
    this.p = p;
    this.ctx = ctx;
    this.name = ctx.NAME().getText();
    
    List<TargContext> targs = ctx.targ();
    targNames = new String[targs.size()]; // TODO verify unique
    for (int i = 0; i < targs.size(); i++) targNames[i] = targs.get(i).NAME().getText();
    
    List<ArgContext> args = ctx.arg();
    treqs = ctx.treq();
    argNames = new String[args.size()];
    argTypes = new ExprContext[args.size()];
    for (int i = 0; i < args.size(); i++) {
      ArgContext arg = args.get(i);
      argNames[i] = arg.NAME().getText();
      argTypes[i] = arg.expr();
    }
  }
  
  public static Derv derv(ArrayList<SiFn> fns, Sc sc, CallableContext c) {
    return derv(fns, sc, defs(sc, c.texpr()), c.NAME().getSymbol());
  }
  
  public static Derv derv(ArrayList<SiFn> fns, Sc sc, List<Def> targTypes, Token tk) {
    for (SiFn f : fns) {
      if (f.targNames.length!= targTypes.size()) continue;
      Derv d = f.derv(sc, targTypes, tk);
      if (d!=null) return d;
    }
    if (fns.size()==1) {
      SiFn f = fns.get(0);
      int exp = f.targNames.length;
      int got = targTypes.size();
      if (exp!=got) throw new ParseError("Incorrect targ count: expected "+exp+", got "+ got, tk);
      throw new ParseError("Conditions not satisfied in "+Derv.toString(fns.get(0).name, targTypes), tk);
    }
    if (fns.size()==0) throw new ParseError("what", tk);
    throw new ParseError("No matching function found for "+Derv.toString(fns.get(0).name, targTypes), tk);
  }
  
  private Derv derv(Sc sc, List<Def> targTypes, Token tk) {
    Derv prev = cache.get(targTypes);
    if (prev!=null) return prev;
    
    ChSc nsc = new ChSc(sc);
    for (int i = 0; i < targTypes.size(); i++) nsc.setDef(targNames[i], targTypes.get(i));
    
    for (TreqContext r : treqs) if (SiReq.bad(nsc, r, targNames, targTypes)) return null;
    
    Derv r = dervRaw(nsc, targTypes, tk);
    sc.prog.addFn(nsc.code.b.toString());
    return r;
  }
  
  private static List<Def> defs(Sc sc, List<TexprContext> ctxs) {
    List<Def> targTypes = new ArrayList<>(ctxs.size());
    for (TexprContext e : ctxs) targTypes.add(sc.texpr(e));
    return targTypes;
  }
  
  private boolean deriving;
  private final HashMap<List<Def>, Derv> cache = new HashMap<>();
  public Derv dervRaw(ChSc nsc, List<Def> vals, Token callsite) {
    try {
      if (deriving) throw new ParseError("Recursive call", callsite);
      deriving = true;
      String id = nsc.prog.nextFn();
      
      nsc.code.b.append("beginFn ").append(id);
      
      ExprContext tc = ctx.retT;
      Type retType = tc==null? null : nsc.type(tc);
      for (int i = 0; i < argNames.length; i++) {
        ExprContext argType = argTypes[i];
        Type t = nsc.type(argType);
        nsc.addVar(argNames[i], new SiExpr.ProcRes(t, nsc.code.next()));
        nsc.code.b.append(' ').append(t);
      }
      
      if (SiProg.COMMENTS) nsc.code.b.append(" // ").append(Derv.toString(name, vals));
      
      nsc.code.b.append('\n');
      
      for (SttContext stt : ctx.stt()) SiStt.process(nsc, stt);
      
      ExprContext retExpr = ctx.retV;
      if (retExpr==null) {
        if (retType==null) throw new ParseError("Function must either end with an expression or specify a result type", ctx);
      } else {
        SiExpr.ProcRes r = SiExpr.process(nsc, retExpr);
        if (retType == null) retType = r.t;
        else if (!r.t.castableTo(retType)) throw new ParseError("Incompatible return type: can't cast " + r.t + " to " + retType, retExpr);
        nsc.code.b.append("ret ").append(r.id).append('\n');
      }
      
      nsc.code.b.append("endFn\n");
      
      Type[] realArgTypes = new Type[argTypes.length];
      for (int i = 0; i < argTypes.length; i++) realArgTypes[i] = nsc.type(argTypes[i]);
      Derv d = new Derv(this, retType, realArgTypes, vals, id);
      cache.put(vals, d);
      return d;
    } finally {
      deriving = false;
    }
  }
  
  public static class Derv {
    public final SiFn base;
    public final Type ret;
    public final Type[] args;
    public final List<Def> targs;
    public final String id;
  
    public Derv(SiFn base, Type ret, Type[] args, List<Def> targs, String id) {
      this.base = base;
      this.ret = ret;
      this.args = args;
      this.targs = targs;
      this.id = id;
    }
  
    public String toString() {
      return toString(base.name, targs);
    }
  
    public static String toString(String name, List<Def> targs) {
      StringBuilder b = new StringBuilder();
      b.append(name).append('{');
      boolean first = true;
      for (Def c : targs) {
        if (first) first = false;
        else b.append(',');
        b.append(c);
      }
      b.append('}');
      return b.toString();
    }
  }
}
