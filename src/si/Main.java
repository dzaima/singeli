package si;

import si.obj.SiProg;

import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try {
      SiProg p = new SiProg("arch/x86.singeli");
      p.addFile("tests/test.singeli");
      p.finish();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  
  public static <T> List<T> of(T t) {
    ArrayList<T> a = new ArrayList<>();
    a.add(t);
    return a;
  }
}
