package cw180912;

import java.io.*;
import java.util.ArrayList;

public class Generator100 {
  static final int from = 'a';
  static final int to = 'z';
  static final int delta = to-from+1;

  public static char charfromRange() {
    return (char) ((Math.random()*delta) + from);
  }

  public static String getString(){
    StringBuilder sb = new StringBuilder();
    int maxLen = (int)(Math.random()*10) + 1;
    for (int i = 0; i < maxLen; i++) {
      sb.append(charfromRange());
    }
    return sb.toString();
  }

  public static ArrayList<String> getList() {
    ArrayList<String> strings = new ArrayList<>();
    for (int i = 0; i <= 100; i++) {
      strings.add(getString());
    }
    return strings;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/main/java/cw180912/str.txt")));
    getList().forEach(s -> {
      try {
        bw.write(s);
        bw.write("\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    bw.close();
  }
}
