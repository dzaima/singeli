package si.types;

import si.gen.SingeliParser.SttContext;
import si.scope.ChSc;

public class BlockDef extends Def {
  public final SttContext ctx;
  public final ChSc sc;
  public final String iId;
  public final String[] varIds;
  
  public BlockDef(SttContext ctx, ChSc sc, String iId, String[] varIds) {
    this.ctx = ctx;
    this.sc = sc;
    this.iId = iId;
    this.varIds = varIds;
  }
  
  public int hashCode() { return System.identityHashCode(this); }
  public boolean equals(Object o) { return o==this; }
  
  public String toString() {
    return "[block]";
  }
}
