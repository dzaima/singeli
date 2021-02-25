package si.obj;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import si.ParseError;
import si.gen.SingeliParser.*;
import si.scope.*;
import si.types.*;
import si.types.ct.*;
import si.types.num.*;

import java.util.*;

public class SiExpr {
  public static ProcRes TRUE = makeConst(BoolConst.TRUE);
  public static ProcRes FALSE = makeConst(BoolConst.FALSE);
  public static ProcRes VOID = new ProcRes(VoidType.D, "_");
  public static ProcRes makeConst(Const c) { return new ProcRes(c.type(), "!"+c); }
  
  public static class ProcRes {
    public final Type t;
    public final String id;
    public ProcRes(Type t, String id) {
      this.t = t;
      this.id = id;
    }
    public String toString() { return t.toString(); }
  }
  public static ProcRes process(ChSc sc, ExprContext e) {
    if (e instanceof VarExprContext) return sc.var(((VarExprContext) e).v.getText(), e.getStart());
    
    if (e instanceof TrueExprContext) return TRUE;
    if (e instanceof FalseExprContext) return FALSE;
    Const cval = getConst(sc, e);
    if (cval!=null) return makeConst(cval);
    if (e instanceof GroupExprContext) return process(sc, ((GroupExprContext) e).expr());
    
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      return builtin(sc, ec.l, ec.r, ec.ref, ec.ref.getText().equals("+")? sc.prog.add : sc.prog.sub);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      return builtin(sc, ec.l, ec.r, ec.ref, ec.ref.getText().equals("*")? sc.prog.mul : sc.prog.div);
    }
    if (e instanceof RelExprContext) {
      RelExprContext ec = (RelExprContext) e;
      String t = ec.ref.getText();
      return builtin(sc, ec.l, ec.r, ec.ref, t.equals(">")? sc.prog.gt : t.equals(">=")? sc.prog.ge : t.equals("<")? sc.prog.lt : t.equals("<=")? sc.prog.le : null);
    }
    if (e instanceof DefCallExprContext) {
      DefCallExprContext ec = (DefCallExprContext) e;
      Def d = sc.getDef(ec.n.getText(), ec.n);
      if (!(d instanceof SiDef.DefWrap)) throw new ParseError("Expected def, got "+d, ec.n);
      return ((SiDef.DefWrap) d).exec(sc, ec.tinv(), ec.n);
    }
    if (e instanceof CallExprContext) {
      CallExprContext ec = (CallExprContext) e;
      CallableContext c = ec.callable();
      SiFn.Derv derv = sc.getFn(c.n.getText(), c.start).derv(sc, c);
      List<ExprContext> args = ec.expr();
      if (args.size()!=derv.args.length) throw new ParseError("Incorrect argument count", ec);
      ProcRes[] pargs = new ProcRes[args.size()];
      for (int i = 0; i < args.size(); i++) {
        ProcRes arg = SiExpr.process(sc, args.get(i));
        if (!arg.t.castableTo(derv.args[i])) throw new ParseError("Incorrect argument type: expected "+ derv.args[i]+", got "+arg, args.get(i));
        pargs[i] = arg;
      }
      return emitCall(sc, derv, pargs);
    }
    if (e instanceof EmitExprContext) {
      EmitExprContext ec = (EmitExprContext) e;
      String v = sc.code.next();
      List<ExprContext> exprs = ec.expr();
      Type t = sc.type(exprs.get(0));
      StringBuilder tmp = new StringBuilder();
      for (int i = 1; i < exprs.size(); i++) {
        ProcRes p = process(sc, ec.expr(i));
        tmp.append(' ').append(p.id);
      }
      sc.code.b.append("new ").append(v).append(" emit ").append(t).append(' ').append(str(ec.STR())).append(tmp).append('\n');
      return new ProcRes(t, v);
    }
    if (e instanceof FldExprContext) {
      FldExprContext c = (FldExprContext) e;
      Def f = processDef(sc, c.e).fld(c.n.getText());
      if (f instanceof Const) return makeConst((Const) f);
      throw new ParseError("Expected value, got "+f, c);
    }
    
    if (e instanceof VecExprContext || e instanceof PtrExprContext || e instanceof FvecExprContext) throw new ParseError("Expected a value, got type", e);
    throw new ParseError("TODO SiExpr::process "+e.getClass(), e);
  }
  
  private static ProcRes builtin(ChSc sc, ExprContext lc, ExprContext rc, Token ref, ArrayList<SiFn> fn) {
    ProcRes l = process(sc, lc);
    ProcRes r = process(sc, rc);
    return emitCall(sc, SiFn.derv(fn, sc, Arrays.asList(l.t, r.t), ref), l, r);
  }
  
  private static ProcRes emitCall(ChSc sc, SiFn.Derv derv, ProcRes... args) {
    String v = sc.code.next();
    StringBuilder b = sc.code.b;
    b.append("new ").append(v).append(" call ").append(derv.ret).append(' ').append(derv.id).append(' ').append(args.length);
    for (ProcRes arg : args) b.append(' ').append(arg.id);
    b.append('\n');
    return new ProcRes(derv.ret, v);
  }
  private static Const getConst(Sc sc, ExprContext e) {
    if (e instanceof IntExprContext) {
      String s = ((IntExprContext) e).v.getText();
      try {
        int v = Integer.parseInt(s);
        return new IntConst(v, IntType.i32);
      } catch (NumberFormatException t) { throw new ParseError("Invalid number literal "+s, e); }
    }
    if (e instanceof TintExprContext) {
      TintExprContext ec = (TintExprContext) e;
      String s = ec.v.getText();
      int p = s.indexOf('u'); if (p==-1) p = s.indexOf('i');
      String i = s.substring(0, p);
      try {
        long val = s.charAt(p) == 'i'? Long.parseLong(i) : Long.parseUnsignedLong(i);
        IntType ty = (IntType) sc.getDef(s.substring(p), ec.v);
        if (ty.w!=64 && val != (val & (ty.signed?ty.max_s:ty.max_u))) throw new ParseError("Invalid number literal "+s, ec);
        return new IntConst(val, ty);
      } catch (NumberFormatException t) { throw new ParseError("Invalid number literal "+s, ec); }
    }
    if (e instanceof HexExprContext) {
      String s = ((HexExprContext) e).v.getText();
      int p = s.indexOf('u'); if (p==-1) p = s.indexOf('i');
      String val = p==-1? s.substring(2) : s.substring(2, p);
      IntType ty = p==-1? IntType.i32 : (IntType) sc.getDef(s.substring(p), e.getStart());
      if (val.length() > ty.w/4) throw new ParseError("Invalid hex constant "+s, e);
      return new IntConst(Long.parseLong(val, 16), ty);
    }
    if (e instanceof F32ExprContext) {
      String s = ((F32ExprContext) e).v.getText();
      try {
        return new F32Const(Float.parseFloat(s.substring(0, s.length()-1)));
      } catch (NumberFormatException t) { throw new ParseError("Invalid float literal "+s, e); }
    }
    if (e instanceof F64ExprContext) {
      String s = ((F64ExprContext) e).v.getText();
      try {
        return new F64Const(Float.parseFloat(s.substring(0, s.length()-1)));
      } catch (NumberFormatException t) { throw new ParseError("Invalid float literal "+s, e); }
    }
    return null;
  }
  
  public static Def processDef(Sc sc, ExprContext e) {
    if (e instanceof GroupExprContext) return processDef(sc, ((GroupExprContext) e).expr());
    if (e instanceof VarExprContext) return sc.getDef(((VarExprContext) e).NAME().getText(), e.getStart());
    
    if (e instanceof TrueExprContext) return BoolConst.TRUE;
    if (e instanceof FalseExprContext) return BoolConst.FALSE;
    Const cval = getConst(sc, e);
    if (cval!=null) return cval;
    
    if (e instanceof AddExprContext) {
      AddExprContext ec = (AddExprContext) e;
      Def l = processDef(sc, ec.expr(0));
      Def r = processDef(sc, ec.expr(1));
      return ec.ref.getText().equals("+")? l.add(r) : l.sub(r);
    }
    if (e instanceof MulExprContext) {
      MulExprContext ec = (MulExprContext) e;
      Def l = processDef(sc, ec.expr(0));
      Def r = processDef(sc, ec.expr(1));
      return ec.ref.getText().equals("*")? l.mul(r) : l.div(r);
    }
    if (e instanceof RelExprContext) {
      RelExprContext ec = (RelExprContext) e;
      Def l = processDef(sc, ec.expr(0));
      Def r = processDef(sc, ec.expr(1));
      switch (ec.ref.getText()) {
        case ">": return l.gt(r); case ">=": return l.ge(r);
        case "<": return r.gt(l); case "<=": return r.ge(l);
      }
    }
    
    // type-only
    if (e instanceof VecExprContext) {
      VecExprContext c = (VecExprContext) e;
      Def d = sc.getDef(c.NAME().getText(), c.NAME().getSymbol());
      if (!(d instanceof NumType)) throw new ParseError("Expected vector element type to be a number, was "+d, c);
      Const v = processConst(sc, c.expr());
      if (!(v instanceof IntConst)) throw new ParseError("Expected vector element type to be a number, got ["+v+"]"+d, c);
      return new VecType(((IntConst) v).val, (NumType) d);
    }
    if (e instanceof FvecExprContext) {
      FvecExprContext c = (FvecExprContext) e;
      Def d = sc.getDef(c.NAME().getText(), c.NAME().getSymbol());
      if (!(d instanceof NumType)) throw new ParseError("Expected vector element type to be a number, was "+d, c);
      return new VecType(sc.prog.arch.maxWidth/((NumType) d).w, (NumType) d);
    }
    if (e instanceof PtrExprContext) {
      PtrExprContext c = (PtrExprContext) e;
      return new PtrType(sc.type(c.expr()));
    }
    if (e instanceof FldExprContext) {
      FldExprContext c = (FldExprContext) e;
      return processDef(sc, c.e).fld(c.n.getText());
    }
    
    if (e instanceof CallExprContext) throw new ParseError("Cannot call functions in a static context", e);
    
    throw new ParseError("TODO SiExpr::processConst "+e.getClass(), e);
  }
  public static Const processConst(Sc sc, ExprContext e) {
    Def d = processDef(sc, e);
    if (!(d instanceof Const)) throw new ParseError("Expected a value, got "+d, e);
    return (Const) d;
  }
  public static String processBool(ChSc sc, ExprContext e) {
    SiExpr.ProcRes cond = SiExpr.process(sc, e);
    if (!cond.t.equals(Bool.u1)) throw new ParseError("Expected boolean, got "+cond.t);
    return cond.id;
  }
  
  
  
  public static String str(TerminalNode STR) {
    String s = STR.getText();
    return s.substring(1, s.length()-1);
  }
}
