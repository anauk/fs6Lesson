package cw180704;

import java.util.Scanner;

public class Problem01 {

    private static int convert1(String s) {
        return 0;
    }

    private static int convert2(String s, int defValue) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int converted1 = convert1(s);
        int converted2 = convert2(s, -33);


        int i = Integer.parseInt(s);
        System.out.println(i);
    }

}
