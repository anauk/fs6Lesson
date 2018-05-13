package codegym;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        String str = in.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}