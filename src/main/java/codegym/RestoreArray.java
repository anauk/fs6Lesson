package codegym;

import java.util.*;

public class RestoreArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // read dimension
        int N = in.nextInt();
        // declare an array
        int nums[] = new int[N];
        // read an array
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        // restore
        int index =1;
        while (index < nums.length-1) {
            if (nums [index] < 0) {
                nums [index] = (nums[index-1]+nums[index+1])/2;
                index++;
            }
            index++;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(nums[i]+" ");
        }
    }
}