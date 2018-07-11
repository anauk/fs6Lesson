package cw180701;

import java.io.*;

public class Sprint01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(
                new FileWriter(
                        new File("src/main/java/cw180701","4.txt")));
        w.write(49);
        w.write(55);
        w.write(" ");
        w.close();
    }
}
