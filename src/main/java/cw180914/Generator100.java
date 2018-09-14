package cw180914;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Generator100 {
  public static Integer random1000() {
      return (int)(Math.random() * 1000 + 1);
  }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/main/java/cw180914/str.txt")));
      for (int i = 0; i < 100 ; i++) {
          bw.write(random1000().toString());
          bw.write("\n");
      }
    bw.close();
  }
}
