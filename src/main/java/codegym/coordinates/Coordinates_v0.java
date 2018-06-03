package codegym.coordinates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Coordinates_v0 {
    public static void main_class(String[] args) {
        String input = "This is test string";
        Scanner in = new Scanner(
                input
                //System.in
        );
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        String line = in.nextLine();
        PriorityQueue<Character> pqKeys = new PriorityQueue<>();
        for (int i = 0; i < line.length(); i++) {
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
            System.out.printf("%s=%s%s", currentKey, map.get(currentKey), pqKeys.isEmpty() ? "" : ", ");
        }
    }
}