package si;

import java.io.IOException;
import java.nio.file.*;

public class Main {
  public static void main(String[] args) {
    String s;
    try {
      s = new String(Files.readAllBytes(Paths.get("tests/tests.singeli")));
      new SiProg(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
