package codegym;

import java.util.*;

public class ReverseSingleWord {
    public static void main(String[] args) {
        Scanner in = new Scanner("abcd");
        String next = in.next();
        char[] word = next.toCharArray();

        reverse(word);
        System.out.print(word);
    }

    public static void reverse2(char[] word) {
        int len = word.length;
        for (int i = 0; i <len/2 ; i++) {
            char tem;
            tem = word[i];
            word[i] = word[len-1-i];
            word[len-1-i] =  tem;
        }
    }

    public static void reverse(char[] word) {
        int len = word.length;
        int half = (int) Math.floor(len/2);
        for (int i = 0; i < half ; i++) {
            word[i] ^= word[len-1-i];
            word[len-1-i] ^= word[i];
            word[i] ^= word[len-1-i];
        }
    }
}