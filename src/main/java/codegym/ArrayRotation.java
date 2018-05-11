package codegym;

import java.util.*;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        int[] result = rotate(nums, k);

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] rotate2(int[] nums, int k) {
        int[] tmp = new int[nums.length];

        for (int i = 0; i < k; i++) {
            tmp[nums.length-k+i] = nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            tmp[i-k]=nums[i];
        }

        return tmp;
    }

    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[(i + k) % nums.length ];
        }

        return result;
    }

}