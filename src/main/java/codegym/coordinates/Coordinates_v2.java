package codegym.coordinates;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Coordinates_v2 {
    public static void main(String[] args) {
        String line = "This is test string";
        String done = IntStream
                .range(0, line.length()) // 0..line.length
                .mapToObj(index -> new Pair(line.charAt(index), index))
                .filter(pair -> Character.isLetter(pair.ch()))  // Pair<>...
                .collect(groupingBy(Pair::ch, mapping(Pair::pos, toList())))
                .entrySet().stream()
                .sorted((o1, o2) -> o1.getKey() - o2.getKey())
                .map(e -> String.format("%s=%s", e.getKey(), e.getValue()))
                .collect(joining(", "));
        System.out.println(done);
    }
}
