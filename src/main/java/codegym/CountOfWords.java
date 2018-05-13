package codegym;

import java.util.*;

public class CountOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        int counted = solve(line);
        System.out.println( counted );
    }

    public static int solve (String str){
        int count = 0;
        boolean shouldCount = true;
        for (int i = 0; i < str.length(); i++){
            if (shouldCount && str.charAt(i) != ' '){
                count++;
            }
            shouldCount = str.charAt(i) == ' ';
        }
        return count;
    }
}