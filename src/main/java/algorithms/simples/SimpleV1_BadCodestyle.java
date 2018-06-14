package algorithms.simples;

import java.util.Scanner;

public class SimpleV1_BadCodestyle {
    public static void main (String[]args){
        System.out.print("Enter maximum number: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int j = 1; j <= N; j++) {
            boolean b1 = true;
            for (int i = 2; i <= j-1; i++) {
                if(j % i == 0) {
                    b1 = false;
                    break;
                }
            }
            System.out.print( b1?j + " ":"");
        }
    }
}