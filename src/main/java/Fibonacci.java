import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        int fibo = fibo(N);
        System.out.printf("The fibonacci %d-th number is%d\n",N,fibo);
    }
}
