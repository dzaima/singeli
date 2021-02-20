package si.types;

import org.antlr.v4.runtime.Token;
import si.ParseError;

public class Type extends Def {
  public boolean castableTo(Type t) {
    return this.equals(t);
  }
  public Type mul(int mul, Token tk) { throw new ParseError("Cannot multiply "+this, tk); }
}
