package si.types;

public class PtrType extends Type {
  public final Type item;
  public PtrType(Type item) {
    this.item = item;
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof PtrType)) return false;
    PtrType t = (PtrType) o;
    return item.equals(t.item);
  }
  
  public int hashCode() {
    return item.hashCode() + 314159265;
  }
  
  public String toString() {
    return "*"+item;
  }
}
