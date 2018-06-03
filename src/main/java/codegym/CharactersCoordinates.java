package codegym;

import java.util.*;

public class CharactersCoordinates {
    public static void main_class(String[] args) {
        String input="This is test string";
        Scanner in = new Scanner(
                input
                //System.in
        );
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        String line = in.nextLine();
        PriorityQueue<Character> pqKeys = new PriorityQueue<>();
        for (int i = 0; i < line.length(); i++){
            char symbol = line.charAt(i);
            if (Character.isLetter(symbol)) {
                if (!pqKeys.contains(symbol)) {
                    pqKeys.add(symbol);
                }
                ArrayList<Integer> positions = map.getOrDefault(symbol, new ArrayList<>());
                positions.add(i);
                map.put(symbol, positions);
            }
        }
        while (!pqKeys.isEmpty()) {
            Character currentKey = pqKeys.poll();
            System.out.printf("%s=%s%s",currentKey, map.get(currentKey), pqKeys.isEmpty()?"":", ");
        }
    }

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