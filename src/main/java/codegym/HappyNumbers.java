package codegym;

import java.util.*;

public class HappyNumbers {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int array [] = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int counter = 0;

        for (int i = 0; i < array.length ; i++) {
            int rest = array[i]%7;
            if (rest == 0) counter++;
        }
        System.out.println(counter);



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (in.nextInt()%7 == 0) counter++;
        }
        System.out.println(counter);
    }
}
