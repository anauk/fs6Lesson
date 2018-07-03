package optional;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptSample001 {
    public static void main0(String[] args) {
        IntStream.range(0,10)
                .filter(i->i>10)
                .forEach(System.out::println);
    }

    public static void main1(String[] args) {
        OptionalInt min = IntStream.range(0, 10)
                .filter(i->i>10)
                .min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        }
    }

    public static void main2(String[] args) {
        OptionalInt min = IntStream.range(0, 10)
                .filter(i->i>10)
                .min();
        min.ifPresent(value -> System.out.println(value));
    }

    public static void main3(String[] args) {
        int i1 = IntStream.range(0, 10)
                .filter(i -> i > 10)
                .min()
                .orElse(33);

        System.out.println(i1);
    }

    public static void main4(String[] args) {
        String s1 = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return IntStream.generate(() -> 'A' + (int) (26 * Math.random()))
                        .limit(16)
                        .mapToObj(value -> String.valueOf((char) value))
                        .collect(Collectors.joining());
            }
        })
                .limit(10)
                .filter(s -> s.startsWith("X"))
                .findFirst()
                .orElse("MAGIC");
        System.out.println(s1);
    }

    public static void main5(String[] args) {
        Optional<String> first = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return IntStream.generate(() -> 'A' + (int) (26 * Math.random()))
                        .limit(16)
                        .mapToObj(value -> String.valueOf((char) value))
                        .collect(Collectors.joining(""));
            }
        })
                .limit(0)
                //.filter(s -> s.startsWith("X"))
                .findFirst();
        //.ifPresent(null);
                //.orElseThrow((Supplier<? extends RuntimeException>) () -> new IllegalArgumentException("nothing...;("));
                //.orElseThrow(()->new IllegalArgumentException("nothing...;("));
                //.orElseThrow(IllegalArgumentException::new);
        //.forEach(System.out::println);
       // System.out.println(s1);
    }

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("THE VALUE");
        Optional<String> opt2 = Optional.empty();
        Optional<String> opt3 = Optional.ofNullable(null);
        opt1.ifPresent(System.out::println);
        opt2.ifPresent(System.out::println);
        opt3.ifPresent(System.out::println);


    }
}
