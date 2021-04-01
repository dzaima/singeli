package si;

import si.ir.c.*;

import java.io.IOException;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    try {
      Target t = new Target.SSE();
      String s = IR2C.parse(t, new String(Files.readAllBytes(Paths.get(args[0]))));
      System.out.println(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // try {
    //   SiProg p = new SiProg(SiArch.SSE);
    //   p.addFile("tests/tests.singeli");
    //   String ir = p.finish();
    //   System.out.println("\nIR:");
    //   System.out.println(ir);
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }
  }
}
