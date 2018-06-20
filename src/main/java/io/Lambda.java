package io;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();
        emp.forEach(s -> System.out.printf("String: []"));

        emp.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        emp.forEach((String s) -> { System.out.println(s);});
        emp.forEach((String s) -> System.out.println(s));
        emp.forEach(s -> System.out.println(s));
        emp.forEach(System.out::println);


        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        Comparator<Integer> c2 = (Integer o1, Integer o2) -> { return o1-o2; };

        Comparator<Integer> c3 = (Integer o1, Integer o2) -> o1-o2;

        Comparator<Integer> c4 = (o1, o2) -> o1-o2;

    }
}
