package codegym;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        String input="a la guerre comme a la guerre";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : input.split(" ")) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> wordsA = new ArrayList<>(map.keySet());
        wordsA.sort(String::compareTo);
        wordsA.forEach(s -> System.out.println(s+": "+map.get(s)));
    }
}
