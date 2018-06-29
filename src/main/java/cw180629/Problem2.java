package cw180629;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem2 {

    public static int[] produce(int amount) {
        return IntStream.generate(()->(int)(Math.random()*100)).limit(amount).toArray();
    }

    public static void main(String[] args) {
        int[] data = produce(50);
        Object[] even = Arrays.stream(data).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList()).toArray();
    }

}
