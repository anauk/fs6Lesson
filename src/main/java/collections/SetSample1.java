package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("raspberry");
        set.add("strawberry");
        set.add("strawberry");
        set.add("strawberry");
        set.add("strawberry");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println(set);
    }
}
