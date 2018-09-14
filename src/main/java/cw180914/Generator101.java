package cw180914;

import java.io.*;

public class Generator101 {

    public static Integer random1000() {
        return (int) (Math.random() * 1000 + 1);
    }

    static final int from = 'a';
    static final int to = 'z';
    static final int delta = to - from + 1;

    public static char charfromRange() {
        return (char) ((Math.random() * delta) + from);
    }

    public static String getString() {
        StringBuilder sb = new StringBuilder();
        int maxLen = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < maxLen; i++) {
            sb.append(charfromRange());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/main/java/cw180914/str2.txt")));
        for (int i = 0; i < 100; i++) {
            String value;
            double random = Math.random();
            if (random > 0.5) {
                value = getString();
            } else {
                value = random1000().toString();
            }
            bw.write(value);
            bw.write("\n");
        }
        bw.close();

    }

}
