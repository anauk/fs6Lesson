package core;

import java.util.HashSet;

public class SetSample2 {
    public static void main(String[] args) {
        HashSet<Short> set = new HashSet<>();
        System.out.println(set.size());
        for (short i=0;i<100;i++) {
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set.size());
    }
}
