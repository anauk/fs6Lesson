package cw180629;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataGeneterator {
    private static final String[] names= {"Masha", "Dasha", "Natasha", "Victor", "Sergey", "Nikolay", "Alexey", "Lena", "Dima", "Maxim", "Petro", "Nikolas"};
    private static final String[] positions= {"Manager", "Topmanager", "Director"};

    public static String mapper(String pos, String name) {
        return String.format("%s:%s",pos,name);
    }

    public static IntStream amount(int n) {
        return IntStream.generate(() -> (int)(Math.random()*(names.length))).limit(n);
    }

    public static Stream<String> managers() {
        return amount(20).mapToObj(i->mapper(positions[0],names[i]));
    }

    public static Stream<String> topManagers() {
        return amount(6).mapToObj(i->mapper(positions[1],names[i]));
    }

    public static Stream<String> directors() {
        return amount(2).mapToObj(i->mapper(positions[2],names[i]));
    }

    public static void writeEntry(String s, Writer w) {
        try {
            w.write(s);
            w.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final Collector<?, ?, ?> shuffler = Collectors.collectingAndThen(
            Collectors.toList(),
            list -> {
                Collections.shuffle(list);
                return list;
            }
    );

    @SuppressWarnings("unchecked")
    public static <T> Collector<T, ?, List<T>> toShuffledList() {
        return (Collector<T, ?, List<T>>) shuffler;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File("src/main/java/cw180629","data3.txt")));
        Stream.concat(Stream.concat(managers(),topManagers()),directors())
                .collect(toShuffledList())
        .forEach(s-> writeEntry(s,w));
        w.close();
    }
}
