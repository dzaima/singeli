package si;

import org.antlr.v4.runtime.Token;
import si.stt.*;
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
    return dervRaw(sc.sub(), targTypes, c.NAME().getSymbol());
  }
  
  private boolean deriving;
  private final HashMap<List<Def>, Derv> cache = new HashMap<>();
  public Derv dervRaw(Sc.ChSc nsc, List<Def> vals, Token callsite) {
    Derv prev = cache.get(vals);
    if (prev!=null) return prev;
    
    try {
      if (deriving) throw new ParseError("Recursive call", callsite);
      deriving = true;
      
      for (int i = 0; i < vals.size(); i++) nsc.addDef(targNames[i], vals.get(i));
  
      ExprContext tc = ctx.retT;
      Type retType = tc==null? null : nsc.type(tc);
      for (int i = 0; i < argNames.length; i++) {
        ExprContext argType = argTypes[i];
        nsc.addVar(argNames[i], nsc.type(argType));
      }
      
      for (SttContext stt : ctx.stt()) SiStt.process(nsc, stt);
      
      ExprContext retExpr = ctx.retV;
      if (retExpr==null) {
        if (retType==null) throw new ParseError("Function must either end with an expression or specify a result type", ctx);
      } else {
        Type rt = SiExpr.process(nsc, retExpr);
        if (retType == null) retType = rt;
        else if (!rt.castableTo(retType)) throw new ParseError("Incompatible return type: can't cast " + rt + " to " + retType, retExpr);
      }
      
      Type[] realArgTypes = new Type[argTypes.length];
      for (int i = 0; i < argTypes.length; i++) realArgTypes[i] = nsc.type(argTypes[i]);
      Derv d = new Derv(this, retType, realArgTypes);
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
  
    public Derv(SiFn base, Type ret, Type[] args) {
      this.base = base;
      this.ret = ret;
      this.args = args;
    }
  }
}
