package codegym.coordinates;

import java.util.*;

public class CharactersCoordinates {

    public static void main(String[] args) {
        String input="This is test string";
        Scanner in = new Scanner(
                input
                //System.in
        );
        String line = in.nextLine();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++){
            char symbol = line.charAt(i);
            if (Character.isLetter(symbol)) {
                ArrayList<Integer> positions = map.getOrDefault(symbol, new ArrayList<>());
                positions.add(i);
                map.put(symbol, positions);
            }
        }
        PriorityQueue<Map.Entry<Character, List<Integer>>> outcome = new PriorityQueue<>((o1, o2) -> o1.getKey()-o2.getKey());
        map.forEach((c, l) -> outcome.add(new AbstractMap.SimpleEntry<>(c, l)));
        while (!outcome.isEmpty()) {
            Map.Entry e = outcome.poll();
            System.out.printf("%s=%s%s",e.getKey(), e.getValue(), outcome.isEmpty()?"":", ");
        }
    }
}