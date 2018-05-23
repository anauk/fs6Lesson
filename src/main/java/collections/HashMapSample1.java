package collections;

import java.util.HashMap;

public class HashMapSample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"alex");
        map.put(1,"ALEX");

        map.put(2,"dima");

        String s = map.get(1);
        System.out.println(s);
        String s2 = map.get(2);
        System.out.println(s2);

    }
}
