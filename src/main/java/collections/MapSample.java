package collections;

import steak.Steak;

import java.util.ArrayList;
import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        HashMap<String, Steak> map = new HashMap<>();
        map.put("vasya", new Steak("Rare"));
        map.put("masha", new Steak("Well Done"));
        map.put("alex", new Steak("Medium"));
        map.put("victor", new Steak("Special"));

        Steak v = map.get("vasya");
        System.out.println(v.name());
        System.out.println(map.get("victor").name());

        ArrayList<Integer> line = new ArrayList<>();
        ArrayList<ArrayList<Integer>> board = new ArrayList<>();
        ArrayList<ArrayList<ArrayList<Integer>>> cube = new ArrayList<>();

    }
}
