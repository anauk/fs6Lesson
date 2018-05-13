package codegym;

import java.util.Scanner;

public class Ranges {
    public static void main(String[] args) {
        String input = "92\n" +
                "4 5 6 11 12 13 14 19 20 26 27 37 38 39 47 56 57 58 62 63 73 74 75 76 86 87 88 89 97 98 100 101 109 110 111 114 115 126 127 128 129 135 136 142 152 153 154 162 163 164 168 169 170 177 178 179 189 190 191 194 195 200 201 202 203 211 216 217 218 225 228 229 230 231 242 243 244 253 254 259 260 261 262 269 273 276 277 278 279 281 292 293";
        Scanner in = new Scanner(
                input
                //System.in
        );
        final int N = in.nextInt();
        int[] num = new int[N+1];
        for (int i = 0; i < N; i++) {
            num[i] = in.nextInt();
        }
        int min = num[0];
        int max = min;

        for (int i = 1; i < num.length; i++) {
            if (num[i] - num[i-1] == 1) {
                max = num[i];
            } else {
                if (min == max) {
                    System.out.printf("[%d]", min);
                } else {
                    System.out.printf("[%d %d]", min, max);
                }
                min = num[i];
                max = min;
            }
        }
    }
}