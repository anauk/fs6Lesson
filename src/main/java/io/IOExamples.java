package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class IOExamples {
    public static void main0(String[] args) {
        String s = "Hello";
        System.out.println(s.length());
        System.out.println(s.getBytes().length);

        String s1 = "Привет";
        System.out.println(s1.length());
        System.out.println(s1.getBytes().length);

        String s2 = new String(s1.getBytes(), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws IOException {
        File f = new File("src/main/java/io", "data.txt");// path/name
        new File("path/name"); // path/name
        new File("./path/name"); // path/name
        new File("/path/name"); // path/name
        FileReader fr = new FileReader(f);
        BufferedReader r1 = new BufferedReader(fr);

        BufferedReader r = new BufferedReader(new FileReader(new File("src/main/java/io", "data.txt")));
        String line;
        while ((line = r.readLine())!=null) {
            System.out.println(line);
        }

        Stream<String> lines = r.lines();

        BufferedWriter w = new BufferedWriter(new FileWriter(new File("1.txt")));
        w.write(";)");
        w.close();




    }
}
