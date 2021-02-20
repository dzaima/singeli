package si;

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
  
  public Type derv(Sc psc, List<TexprContext> vals) {
    if (vals.size() != targNames.length) throw new Error("Incorrect targ count");
    Sc.ChSc nsc = psc.sub();
    for (int i = 0; i < vals.size(); i++) {
      nsc.addDef(targNames[i], psc.texpr(vals.get(i)));
    }
    TypeContext tc = ctx.type();
    Type retType = tc==null? null : nsc.type(tc);
    for (int i = 0; i < argNames.length; i++) {
      TypeContext argType = argTypes[i];
      nsc.addVar(argNames[i], nsc.type(argType));
    }
    for (SttContext stt : ctx.stt()) {
      SiStt.process(nsc, stt);
    }
    ExprContext retExpr = ctx.expr();
    if (retExpr==null) {
      if (retType==null) throw new Error("Function must either end with an expression or specify a result type");
      return retType;
    }
    Type rt = SiExpr.process(nsc, retExpr);
    if (retType != null) {
      if (!rt.castableTo(retType)) throw new Error("Incompatible return type: can't cast "+rt+" to "+retType);
      return retType;
    }
    return rt;
  }
}
