package streams;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Sample001 {
    public static void main(String[] args) {
        IntStream.
                range(0,10).
                forEach(value -> System.out.println(value));
    }
}
