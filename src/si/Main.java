package si;

import si.obj.SiProg;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      SiProg p = new SiProg();
      p.addFile("arch/x86.singeli");
      p.addFile("tests/test.singeli");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
