package codegym.coordinates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.BiConsumer;

public class CharactersCoordinates {
    static Logger log = LoggerFactory.getLogger(CharactersCoordinates.class);

    public static void main(String[] args) {
        String input="This is test string";
        Scanner in = new Scanner(
                input
                //System.in
        );
        String line = in.nextLine();
        if (line.length()==0)
            log.warn("The string is empty");

        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++){
            log.debug("i:"+i);
            char symbol = line.charAt(i);
            if (Character.isLetter(symbol)) {
                log.trace("symbol:"+symbol);
                ArrayList<Integer> positions = map.getOrDefault(symbol, new ArrayList<>());
                log.trace("positions before:"+positions.toString());
                positions.add(i);
                log.trace("positions after :"+positions.toString());
                map.put(symbol, positions);
            }
        }
        PriorityQueue<Map.Entry<Character, List<Integer>>> outcome = new PriorityQueue<>((o1, o2) -> o1.getKey()-o2.getKey());

        map.forEach(new BiConsumer<Character, ArrayList<Integer>>() {
            @Override
            public void accept(Character c, ArrayList<Integer> l) {
                log.trace(l.toString());
                outcome.add(new AbstractMap.SimpleEntry<>(c, l));
            }
        });

        while (!outcome.isEmpty()) {
            Map.Entry e = outcome.poll();
            log.trace("element :"+e.toString());
            System.out.printf("%s=%s%s",e.getKey(), e.getValue(), outcome.isEmpty()?"":", ");
        }
    }
}