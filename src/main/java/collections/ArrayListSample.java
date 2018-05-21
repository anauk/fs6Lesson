package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(3);
        ints.add(1);
        ints.add(7);
        int sum=0;
        ints.forEach(integer -> System.out.println("element is:"+integer));
        Comparator<Integer> comparatorUp = (i1, i2) -> i1-i2;
        Comparator<Integer> comparatorDown = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2-i1;
            }
        };

        ints.sort(comparatorUp);
        ints.forEach(integer -> System.out.println("element is:"+integer));
        ints.sort(comparatorDown);
        ints.forEach(integer -> System.out.println("element is:"+integer));
    }
}
