package cw180629;

import algorithms.simples.SimpleV4;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        final int min=100;
        final int max=101;

        SimpleV4 algorithm = new SimpleV4(min, max);
        int[] simples = algorithm.array();
        int count = simples.length;

        //System.out.printf("Simples values: %s\n", Arrays.toString(simples));
        System.out.printf("Count simples between %d and %d is %d\n",
                min, max, count);
        //System.out.println(algorithm.count);
    }
}
