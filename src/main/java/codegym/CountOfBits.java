package codegym;

import java.util.Scanner;

public class CountOfBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            sum+=(number>>i)&1;
        }
        System.out.println(sum);
    }
}
