import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();

        int fibo = fibo(N);

        System.out.printf("The fibonacci %d-th number is: %d\n",N,fibo);
    }

    private static int fibo(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}


