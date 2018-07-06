package cw180706;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0; i<a.length; i++) {
            a[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(a));
        int index_min = find_min_index(a);
        int index_max = find_max_index(a);
        swap(a, index_min, index_max);
        System.out.println(Arrays.toString(a));
    }

    private static int find_max_index(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i <a.length; i++) {
            if (a[i] > max){
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    private static int find_min_index(int[] a) {
        int min = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
                index = i;
            }
        }
        return index;
    }

    private static void swap(int[] a, int index_min, int index_max) {
        int temp = a[index_min];
        a[index_min] = a[index_max];
        a[index_max] = temp;
    }
}
