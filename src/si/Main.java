package si;

import si.obj.*;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      SiProg p = new SiProg(SiArch.SSE);
      p.addFile("tests/tests.singeli");
      p.finish();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
