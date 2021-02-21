package si.obj;

public class SiArch {
  public static final SiArch SSE = new SiArch(128, new String[]{"arch/sse.singeli"});
  
  public final int maxWidth;
  public final String[] defs;
  
  private SiArch(int maxWidth, String[] defs) {
    this.maxWidth = maxWidth;
    this.defs = defs;
  }
  
  public static SiArch fake(int w) {
    return new SiArch(w, new String[]{"arch/fake.singeli"});
  }
}
