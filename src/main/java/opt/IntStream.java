package opt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IntStream {
    public static void main(String[] args) {
        Optional<Integer> min = Stream
                .generate(new HiddenGenerator())
                .limit(10)
                .filter(i -> i > 1000)
                .min((o1, o2) -> o1 - o2);
        min.ifPresent(System.out::println);

        min.ifPresent(integer -> System.out.println(integer));

        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
