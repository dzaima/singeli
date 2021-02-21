package si;

import si.obj.*;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      SiProg p = new SiProg(SiArch.SSE);
      p.addFile("tests/test.singeli");
      p.finish();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
