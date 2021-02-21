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
  
  public SiFn(SiProg p, FnContext ctx) {
    this.p = p;
    this.ctx = ctx;
    this.name = ctx.NAME().getText();
    
    List<TargContext> targs = ctx.targ();
    targNames = new String[targs.size()]; // TODO verify unique
    for (int i = 0; i < targs.size(); i++) targNames[i] = targs.get(i).NAME().getText();
    
    List<ArgContext> args = ctx.arg();
    argNames = new String[args.size()];
    argTypes = new ExprContext[args.size()];
    for (int i = 0; i < args.size(); i++) {
      ArgContext arg = args.get(i);
      argNames[i] = arg.NAME().getText();
      argTypes[i] = arg.expr();
    }
  }
  
  public Derv derv(Sc sc, CallableContext c) {
    List<TexprContext> ctxs = c.texpr();
    if (ctxs.size() != targNames.length) throw new ParseError("Incorrect targ count: expected "+targNames.length+", got "+ctxs.size(), c);
    List<Def> targTypes = new ArrayList<>(ctxs.size());
    for (TexprContext e : ctxs) targTypes.add(sc.texpr(e));
    Derv prev = cache.get(targTypes);
    if (prev!=null) return prev;
  
    ChSc nsc = new ChSc(sc);
    Derv r = dervRaw(nsc, targTypes, c.NAME().getSymbol());
    sc.prog.addFn(nsc.code.b.toString());
    return r;
  }
  
  private boolean deriving;
  private final HashMap<List<Def>, Derv> cache = new HashMap<>();
  public Derv dervRaw(ChSc nsc, List<Def> vals, Token callsite) {
    try {
      if (deriving) throw new ParseError("Recursive call", callsite);
      deriving = true;
      String id = nsc.prog.nextFn();
      
      for (int i = 0; i < vals.size(); i++) nsc.addDef(targNames[i], vals.get(i));
      
      nsc.code.b.append("beginFn ").append(id);
  
      ExprContext tc = ctx.retT;
      Type retType = tc==null? null : nsc.type(tc);
      for (int i = 0; i < argNames.length; i++) {
        ExprContext argType = argTypes[i];
        Type t = nsc.type(argType);
        nsc.addVar(argNames[i], new SiExpr.ProcRes(t, nsc.code.next()));
        nsc.code.b.append(' ').append(t);
      }
  
      if (SiProg.COMMENTS) nsc.code.b.append(" // ").append(Derv.toString(this, vals));
      
      nsc.code.b.append('\n');
      
      for (SttContext stt : ctx.stt()) SiStt.process(nsc, stt);
      
      ExprContext retExpr = ctx.retV;
      if (retExpr==null) {
        if (retType==null) throw new ParseError("Function must either end with an expression or specify a result type", ctx);
      } else {
        Type rt = SiExpr.process(nsc, retExpr).t;
        if (retType == null) retType = rt;
        else if (!rt.castableTo(retType)) throw new ParseError("Incompatible return type: can't cast " + rt + " to " + retType, retExpr);
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
      return toString(base, targs);
    }
  
    public static String toString(SiFn base, List<Def> targs) {
      StringBuilder b = new StringBuilder();
      b.append(base.name).append('{');
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
