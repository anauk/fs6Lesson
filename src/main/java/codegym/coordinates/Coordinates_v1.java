package codegym.coordinates;

import java.util.*;
import java.util.function.Consumer;

public class Coordinates_v1 {
    public static void main(String[] args) {
        String line = "This is test string";
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
           if(Character.isLetter(line.charAt(i))){
               Pair pair = new Pair(line.charAt(i), i);
               list.add(pair);
           }
        }
        Set<Character> keysUnique = new HashSet<Character>();
        list.forEach(pair -> keysUnique.add(pair.ch()));
        PriorityQueue<Character> keysSorted = new PriorityQueue<>(keysUnique);
        HashMap<Character, ArrayList<Integer>> outcome = new HashMap<>();
        list.forEach(new Consumer<Pair>() {
            @Override
            public void accept(Pair pair) {
                Character symbol = pair.ch();
                ArrayList<Integer> indexes = outcome.getOrDefault(symbol, new ArrayList<>());
                indexes.add(pair.pos());
                outcome.put(symbol, indexes);
            }
        });
        while (!keysSorted.isEmpty()) {
            Character sym = keysSorted.poll();
            ArrayList<Integer> indexes = outcome.get(sym);
            System.out.printf("%s=%s%s",sym, indexes, keysSorted.isEmpty()?"":", ");
        }
    }
}
