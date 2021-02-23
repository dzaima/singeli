package si.types;

public abstract class Type extends Def {
  public boolean castableTo(Type t) {
    return this.equals(t);
  }
  
  public abstract String toString();
}
