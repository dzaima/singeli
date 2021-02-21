package si;

import si.obj.SiProg;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      SiProg p = new SiProg("arch/x86.singeli");
      p.addFile("tests/x86test.singeli");
      p.finish();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
