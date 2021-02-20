package si.types;

public class Type extends Def {
  public boolean castableTo(Type t) {
    return this.equals(t);
  }
}
