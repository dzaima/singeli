package si;

import org.antlr.v4.runtime.Token;
import si.stt.*;
import si.types.Type;

import java.util.List;

import static si.gen.SingeliParser.*;

public class SiFn {
  public final SiProg p;
  public final String name;
  public final String[] targNames;
  
  public final String[] argNames;
  public final TypeContext[] argTypes;
  
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
    argTypes = new TypeContext[args.size()];
    for (int i = 0; i < args.size(); i++) {
      ArgContext arg = args.get(i);
      argNames[i] = arg.NAME().getText();
      argTypes[i] = arg.type();
    }
  }
  
  private boolean deriving;
  public Derv derv(Sc psc, List<TexprContext> vals, Token callsite) {
    try {
      if (deriving) throw new ParseError("Recursive call", callsite);
      deriving = true;
      if (vals.size() != targNames.length) throw new ParseError("Incorrect targ count", callsite);
      Sc.ChSc nsc = psc.sub();
      
      for (int i = 0; i < vals.size(); i++) nsc.addDef(targNames[i], psc.texpr(vals.get(i)));
      
      TypeContext tc = ctx.type();
      Type retType = tc==null? null : nsc.type(tc);
      for (int i = 0; i < argNames.length; i++) {
        TypeContext argType = argTypes[i];
        nsc.addVar(argNames[i], nsc.type(argType));
      }
      
      for (SttContext stt : ctx.stt()) SiStt.process(nsc, stt);
      
      ExprContext retExpr = ctx.expr();
      if (retExpr==null) {
        if (retType==null) throw new ParseError("Function must either end with an expression or specify a result type", ctx);
      } else {
        Type rt = SiExpr.process(nsc, retExpr);
        if (retType == null) retType = rt;
        else if (!rt.castableTo(retType)) throw new ParseError("Incompatible return type: can't cast " + rt + " to " + retType, retExpr);
      }
      
      Type[] realArgTypes = new Type[argTypes.length];
      for (int i = 0; i < argTypes.length; i++) realArgTypes[i] = nsc.type(argTypes[i]);
      return new Derv(this, retType, realArgTypes);
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
