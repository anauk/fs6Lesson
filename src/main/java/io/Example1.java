package io;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/io", "strings.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //System.out.println(file.exists());
        ArrayList<String> strings = new ArrayList<>();
        String s = br.readLine();
        while(s!=null){
         strings.add(s);
         s = br.readLine();
     }

        Collections.sort(strings);
        //Collections.sort(strings, (o1, o2) -> o2.length()-o1.length());
        //strings.sort((o1, o2) -> o2.length()-o1.length());

        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        File stringSorted = new File("src/main/java/io","StringSorted.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(stringSorted));
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                try {
                    bw.write(s);
                    bw.write("\n");
                } catch (IOException ignored) { }
            }
        });
        bw.close();

    }

    public static void main_s(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("src/main/java/io", "stringsSorted.txt")));
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/io", "strings.txt")));
        Stream<String> lines = br.lines();
                lines.sorted((o1, o2) -> o1.length()-o2.length())
                //.forEach(writeline(bw));
                .forEachOrdered(writeline(bw));
        bw.close();
    }

    private static Consumer<String> writeline(BufferedWriter bw) {
        return new Consumer<String>() {
            @Override
            public void accept(String s) {
                try {
                    bw.write(s + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}

