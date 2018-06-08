import exceptions.Div;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DivTest {
    public static void main(String[] args) {
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

    public static void main1(String[] args) {
        int i1=10;
        int i2=0;

        if (i2==0) {
            System.out.println("you shouldn't divide by zero ;)");
        } else {
            Div d = new Div(i1, i2);
            System.out.printf("%d/%d = %d", i1, i2, d.get());
        }
    }
}
