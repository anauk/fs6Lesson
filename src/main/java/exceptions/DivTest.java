package exceptions;

import com.sun.org.apache.xpath.internal.SourceTree;
import exceptions.Div;

import java.util.*;

public class DivTest {
    public static void main5(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(34);
        System.out.println(m2(list));
/*
        int i=m2(list);
        System.out.println(i);
        if (!list.isEmpty()) {
            int i=findMin(list);
            System.out.println(i);
        } else {
            System.out.println("no elements");
        }
*/
    }

    public static String m2 (List<Integer> list) {
        try {
            return Integer.toString(m1(list));
        } catch (Exception e) {
            return "I can't find minimum from empty list";
        }
    }

    public static int m1 (List<Integer> list) throws Exception {
        return findMin(list);
    }

    private static int findMin(List<Integer> list) throws Exception {
        if (list.isEmpty()) throw new Exception("list empty");
        return list.stream().min((o1, o2) -> o1-o2).get();
    }

    private static int findMin_v0(ArrayList<Integer> list) {
        return list.isEmpty() ? -1 : list.stream().min((o1, o2) -> o1-o2).get();
    }

    public static void main4(String[] args) {
        int i1=10;
        int i2=0;

        if (i2==0) {
            System.out.println("you shouldn't divide by zero ;)");
        } else {
            Div d = new Div(i1, i2);
            System.out.printf("%d/%d = %d", i1, i2, d.get());
        }
    }

    public static void main6(String[] args) throws Exception {
        int i1=10;
        int i2=0;
        try {
            Div d = new Div(i1, i2);
            System.out.printf("%d/%d = %d", i1, i2, d.get());
        } catch (ArithmeticException e) {
            System.out.println("please don't divide by zero(((");
            throw new Exception();
        } finally {

        }
    }

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("11A");
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("given string can't be converted to int");
        }
    }

    public static void main99(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        //dq.add(13);

        try {
            Integer el1 = dq.remove(); // exception
        } catch (NoSuchElementException e) {
            System.out.println("no elements");
        }

        Integer v = dq.poll();
        if (v==null) {
            System.out.println("no elements");
        } else {
            System.out.println(v);
        }


    }
}
