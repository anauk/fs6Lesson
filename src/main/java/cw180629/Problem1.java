package cw180629;

import algorithms.simples.SimpleV4;

public class Problem1 {
    public static void main(String[] args) {
        final int min=1000;
        final int max=9999;

        SimpleV4 algorithm = new SimpleV4(min, max);
        int[] simples = algorithm.array();
        int count = simples.length;

        System.out.printf("Count simples between %d and %d is %d\n",
                min, max, count);
    }
}
