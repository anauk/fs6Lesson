package patterns.facade;

import java.util.*;
import java.util.function.Consumer;

public class ClazzTest {
    public static void main(String[] args) {
        List<Driveable> list = new ArrayList<>();
        list.add(new Clazz1());
        list.add(new Clazz2());
        list.add(new Clazz3());
        list.add(new Driveable() {
            @Override
            public void print() {
                System.out.println("Special");
            }

            @Override
            public int maxSpeed() {
                return 5;
            }
        });
        list.forEach(new Consumer<Driveable>() {
            @Override
            public void accept(Driveable printable) {
                printable.print();
            }
        });
        Collections.sort(list, new Comparator<Driveable>() {
            @Override
            public int compare(Driveable o1, Driveable o2) {
                return o1.maxSpeed()-o2.maxSpeed();
            }
        });
        System.out.println("---------");
        list.forEach(Driveable::print);


    }
}
