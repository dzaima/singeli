package si.obj;

import org.antlr.v4.runtime.Token;
import si.ParseError;
import si.gen.SingeliParser;
import si.scope.*;
import si.types.*;

import java.util.*;

import static si.gen.SingeliParser.*;

public class SiFn {
  public final SiProg p;
  public final String name;
  public final SiTargs targs;
  
  public final String[] argNames;
  public final ExprContext[] argTypes;
  
  private final FnContext ctx;
  
  public SiFn(SiProg p, FnContext ctx) {
    this.p = p;
    this.ctx = ctx;
    this.name = ctx.n.getText();
    this.targs = new SiTargs(ctx.targs());
    List<SingeliParser.ArgContext> args = ctx.arg();
    argNames = new String[args.size()];
    argTypes = new SingeliParser.ExprContext[args.size()];
    for (int i = 0; i < args.size(); i++) {
      SingeliParser.ArgContext arg = args.get(i);
      argNames[i] = arg.NAME().getText();
      argTypes[i] = arg.expr();
    }
  }
  
  public static Derv derv(ArrayList<SiFn> fns, Sc sc, CallableContext c) {
    ArrayList<Def> targTypes;
    if (c.t != null) {
      List<TexprContext> ctxs = c.t.texpr();
      targTypes = new ArrayList<>(ctxs.size());
      for (TexprContext e : ctxs) targTypes.add(sc.constDef(e));
    } else {
      targTypes = new ArrayList<>();
    }
    return derv(fns, sc, targTypes, c.n);
  }
  
  public static Derv derv(ArrayList<SiFn> fns, Sc sc, List<Def> targTypes, Token tk) {
    for (SiFn f : fns) {
      if (f.targs.size!=targTypes.size()) continue;
      Derv d = f.derv(sc, targTypes, tk);
      if (d!=null) return d;
    }
    if (fns.size()==1) {
      SiFn f = fns.get(0);
      int exp = f.targs.size;
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
    if (!targs.derv(sc, nsc, targTypes)) return null;
    
    Derv r = dervRaw(nsc, targTypes, tk);
    sc.prog.addFn(
      "beginFn "+r.id+" "+r.ret+" "+argNames.length+ // completed by fn def; very hacky
      nsc.code.b.toString()+
      (SiProg.COMMENTS? "endFn\n\n" : "endFn\n")
    );
    return r;
  }
  
  private boolean deriving;
  private final HashMap<List<Def>, Derv> cache = new HashMap<>();
  public Derv dervRaw(ChSc nsc, List<Def> vals, Token callsite) {
    try {
      if (deriving) throw new ParseError("Recursive call", callsite);
      deriving = true;
      String id = nsc.prog.nextFn();
      
      
      ExprContext tc = ctx.retT;
      nsc.code.ret = tc==null? null : nsc.type(tc);
      for (int i = 0; i < argNames.length; i++) {
        ExprContext argType = argTypes[i];
        Type t = nsc.type(argType);
        nsc.addVar(argNames[i], new SiExpr.ProcRes(t, nsc.code.next()));
        nsc.code.b.append(' ').append(t);
      }
      
      if (SiProg.COMMENTS) nsc.code.b.append(" # ").append(Derv.toString(name, vals));
      
      nsc.code.b.append('\n');
      ExprContext retExpr = ctx.retV;
      List<SttContext> stts = ctx.stt();
  
      for (SttContext stt : stts) SiStt.process(nsc, stt);
  
      Type retType1 = nsc.code.ret;
      if (retExpr ==null) {
        if (retType1 ==null) throw new ParseError("Function must either end with an expression or specify a result type", ctx.n);
      } else {
        SiExpr.ProcRes r = SiExpr.process(nsc, retExpr);
        if (retType1 == null) retType1 = r.t;
        else if (!r.t.castableTo(retType1)) throw new ParseError("Incompatible return type: can't cast " + r.t + " to " + retType1, retExpr);
        nsc.code.b.append("ret ").append(r.id).append('\n');
      }
      Type retType = retType1;
  
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
