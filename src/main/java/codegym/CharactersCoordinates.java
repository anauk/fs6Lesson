package codegym;

import java.util.*;

public class CharactersCoordinates {
    public static void main(String[] args) {
        String input="This is test string";
        Scanner in = new Scanner(
                input
                //System.in
        );
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        String line = in.nextLine();
        PriorityQueue<Character> pqKeys = new PriorityQueue<>();
        //PriorityQueue<Map.Entry<Character, List<Integer>>> entries = new PriorityQueue<>((o1, o2) -> o1.getKey()-o2.getKey());

        for (int i = 0; i < line.length(); i++){
            char symbol = line.charAt(i);
            if (Character.isLetter(symbol)) {
                if (!pqKeys.contains(symbol)) {
                    pqKeys.add(symbol);
                }
/*
                if (map.containsKey(symbol)) {
                    positions = map.get(symbol);
                } else {
                    positions = new ArrayList<>();
                }
*/
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
}