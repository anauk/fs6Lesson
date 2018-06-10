package tdd;

import java.util.ArrayList;
import java.util.List;

public class ImaginationOneTest {
    private static boolean isSimilar(List<Integer> list1, List<Integer> list2) {
        return list1.equals(list2);
    }

    private static void test1() {
        ImaginationOne imagination = new ImaginationOne();
        List<Integer> sorted1 = imagination.sort1(4,1);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);
        System.out.printf("test1.. %s\n", isSimilar(expected, sorted1) ? "OK" : "ERR");
    }

    private static void test2() {
        ImaginationOne imagination = new ImaginationOne();
        int[] items = new int[] {9,5,3,1};
        List<Integer> sorted2 = imagination.sort2(items);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(5);
        expected.add(9);
        System.out.printf("test2.. %s\n", isSimilar(expected, sorted2) ? "OK" : "ERR");
    }

    private static void test3() {
        ImaginationOne imagination = new ImaginationOne();
        List<Integer> sorted2 = imagination.sort3(5,9,1);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(5);
        expected.add(9);
        System.out.printf("test3.. %s\n", isSimilar(expected, sorted2) ? "OK" : "ERR");
    }

    private static void test4() {
        ImaginationOne imagination = new ImaginationOne();
        List<Integer> sorted1 = imagination.sort3(1);
        List<Integer> sorted2 = imagination.sort3(1,2);
        List<Integer> sorted3 = imagination.sort3(5,9,1);
        List<Integer> sorted4 = imagination.sort3(6,5,9,1);
        List<Integer> sorted5 = imagination.sort3(8,8,8,5,9,1);
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}
