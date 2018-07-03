package cw180624.solutions;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    int[] numbers = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
    System.out.println(java.util.Arrays.toString(numbers));
//    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        numbers[i] /= 2;
      } else if (numbers[i] % 3 == 0) {
        numbers[i] /= 3;
      } else {
        numbers[i] *= 2;
      }
    }

//    for (int i = 0; i < numbers.length; i++) {
//      System.out.printf("%s -> %d \n", numbers[i], numbers[i]);
//    }
    System.out.println(java.util.Arrays.toString(numbers));
  }
}
