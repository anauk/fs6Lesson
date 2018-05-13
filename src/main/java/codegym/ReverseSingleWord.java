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
        for (int i = 0; i < word.length/2 ; i++) {
            word[i] ^= word[word.length-1-i];
            word[word.length-1-i] ^= word[i];
            word[i] ^= word[word.length-1-i];
        }
    }
}