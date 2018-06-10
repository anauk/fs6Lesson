package patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class ClassTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Class1());
        list.add(new Class2());
        list.add(new Class3());
        list.add("BMW");
        list.add(1000);
        list.forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                if (o instanceof Class1) {
                    ((Class1) o).print_a();
                } else if (o instanceof Class2) {
                    ((Class2) o).print_b(0);
                } else if (o instanceof Class3) {
                    ((Class3) o).print_z("hell");
                } else if (o instanceof Object) {
                    System.out.println(o.toString());
                }
            }
        });
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                int speed1 = o1 instanceof Class1 ? ((Class1) o1).maxSpeed() :
                        o1 instanceof Class2 ? ((Class2) o1).getMax() :
                                o1 instanceof Class3 ? ((Class3) o1).max() :
                                        o1 instanceof String ? ((String) o1).length() :
                                                o1 instanceof Integer ? ((Integer) o1).intValue() :
                                                        o1.hashCode();

                int speed2 = o2 instanceof Class1 ? ((Class1) o2).maxSpeed() :
                        o2 instanceof Class2 ? ((Class2) o2).getMax() :
                                o2 instanceof Class3 ? ((Class3) o2).max() :
                                        o2 instanceof String ? ((String) o2).length() :
                                                o2 instanceof Integer ? ((Integer) o2).intValue() :
                                                        o2.hashCode();

                return speed2-speed1;
            }
        });
        list.forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                if (o instanceof Class1) {
                    ((Class1) o).print_a();
                } else if (o instanceof Class2) {
                    ((Class2) o).print_b(0);
                } else if (o instanceof Class3) {
                    ((Class3) o).print_z("hell");
                } else if (o instanceof Object) {
                    System.out.println(o.toString());
                }
            }
        });

    }
}
