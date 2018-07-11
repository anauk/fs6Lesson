package cw180629;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem2 {

    public static int[] produce(int amount) {
        return IntStream.generate(()->(int)(Math.random()*100)).limit(amount).toArray();
    }

    public static void main(String[] args) {
        int[] data = produce(30);

        int[] even = Arrays.stream(data).filter(i -> i % 2 == 0).toArray();

        int[] odd = Arrays.stream(data).filter(i -> i % 2 == 1).toArray();

        System.out.printf("Array before: %s\n", Arrays.toString(data));
        System.out.printf("Array of evens: %s, length:%d\n", Arrays.toString(even), even.length);
        System.out.printf("Array of odds: %s, length:%d\n", Arrays.toString(odd), odd.length);
    }
}
