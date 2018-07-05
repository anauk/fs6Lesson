package cw180704;

import java.util.Scanner;

public class Problem01 {

    private static int convert(String s) {
        return convert(s,-1);
    }

    private static int convert(String s, int defValue) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defValue;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int converted1 = convert(s);
        int converted2 = convert(s, -33);

        System.out.println(converted1);
        System.out.println(converted2);

        //System.err.println(1);
    }

}
