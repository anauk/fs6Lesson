package codegym;

import java.util.*;

public class FindPropertiesOfArray {

    public static void main(String[] args) {

        String input = "9\n" +
                "45 41 43 46 46 48 43 43 46";

        Scanner in = new Scanner(input);
        int N = in.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = in.nextInt();
        }
        count(numbers);
    }

    private static void count(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min=Math.min(min, numbers[i]);
            max=Math.max(max, numbers[i]);
            sum += numbers[i];
        }
        double av = (double)sum / numbers.length;
        System.out.printf("%d %d %d %.2f", min, max, sum, av);
    }
}

