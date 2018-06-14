package collections;

import oop.steak.Steak;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListSteakSample {
    public static void main(String[] args) {
        List<Steak> steaks = new LinkedList<>();
        //new ArrayList<>()
        List<String> types = Arrays.asList("Rare", "Medium", "Rare", "Well Done", "Special");
        types.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                steaks.add(new Steak(s));
            }
        });

        System.out.println("-");
        steaks.forEach(steak -> System.out.println(steak.name()));

        steaks.sort(new Comparator<Steak>() {
            @Override
            public int compare(Steak st1, Steak st2) {
                return st1.price()-st2.price();
            }
        });

        System.out.println("-");
        steaks.forEach(steak -> System.out.println(steak.name()));

        steaks.sort(new Comparator<Steak>() {
            @Override
            public int compare(Steak st1, Steak st2) {
                return st1.name().compareTo(st2.name());
            }
        });

        System.out.println("-");
        steaks.forEach(steak -> System.out.println(steak.name()));

        steaks.remove(1);
        System.out.println("-");
        steaks.forEach(steak -> System.out.println(steak.name()));
        steaks.remove(1);
        System.out.println("-");
        steaks.forEach(steak -> System.out.println(steak.name()));

    }
}
