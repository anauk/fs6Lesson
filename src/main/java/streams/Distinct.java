package streams;

import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Distinct {
    public static void main(String[] args) {
    Stream
            .generate(() -> ((char) ('A' + Math.random() * 26)))
            .parallel()
            .limit(100)
            .collect(groupingBy(c->c, counting()))
            .entrySet().stream()
            .sorted((o1, o2) -> o1.getKey()-o2.getKey())
            .forEach(e -> System.out.printf("%s:%d\n",e.getKey(),e.getValue()));
    }}
