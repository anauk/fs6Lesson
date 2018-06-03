package iter;

import java.util.Iterator;

public class MonthsTest {
    public static void m1(String s) {
        System.out.println(s);
    }

    public static void main1(String[] args) {
        Months months = new Months();

        //----------------------------
        Iterator<String> iter = months.iterator();
        while (iter.hasNext()) {
            String m = iter.next();
            System.out.println(m);
        }
        //----------------------------
/*
        for (String m : months) {
            System.out.println(m);
        }
*/

    }

    public static void main(String[] args) {
        Months m = new Months();
        //m.forEach(s -> System.out.println(s));
        m.forEach(System.out::println);
        m.forEach(MonthsTest::m1);
    }
}
