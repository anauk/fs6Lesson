package cw180629;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Problem3 {
    public static void main(String[] args) {
        String inputLine = "Alex Hello";
        String[] split = inputLine.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String s : split) {
            String reverted = new StringBuilder(s).reverse().toString();
            sb.append(reverted.substring(0,1).toUpperCase());
            sb.append(reverted.substring(1).toLowerCase());
            sb.append(" ");
        }
        System.out.printf("was: %s\n",inputLine);
        System.out.printf("is: %s\n",sb.toString());
    }
}
