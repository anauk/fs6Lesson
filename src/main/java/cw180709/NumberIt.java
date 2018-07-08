package cw180709;

import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class NumberIt {
    private static final String PATH = "src/main/java/cw180709";
    private static final String IN = "cities.txt";
    private static final String OUT = "citiesNumbered.txt";
    private static int counter=0;

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File(PATH, OUT)));
        new BufferedReader(new FileReader(new File(PATH, IN))).lines()
        .forEach(new Consumer<String>() {
            @Override
            public void accept(final String s) {
                try {
                    w.write(String.format("%d:%s\n",++counter,s));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        w.close();
    }
}
