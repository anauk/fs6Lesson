package codegym;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary {
    public static void main_v1(String[] args) {
        String input="    giej  dn0br8lqph   oese8fxvj   ddy6   dc  dn0br8lqph  dc   bv4396   tpww2v5 dc bbgaw bbgaw yjnkv15 91  dc  20u2sxgb8l   20u2sxgb8l  h   dc   oese8fxvj ";
        String[] inputArray = input.split("\\s+");
        List<String> data = Arrays.asList(inputArray);
        Collections.sort(data);

        TreeMap<String, Integer> resMap = new TreeMap<>();
        for (int i = 0; i < data.size(); i++){
            String word = data.get(i);
            int count = resMap.getOrDefault(word, 0);
            resMap.put(word, count+1);
        }

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println(s + ": " + i);
            }
        };

        resMap.forEach(biConsumer);
    }

    public static void main_v2(String[] args) {
        String input="    giej  dn0br8lqph   oese8fxvj   ddy6   dc  dn0br8lqph  dc   bv4396   tpww2v5 dc bbgaw bbgaw yjnkv15 91  dc  20u2sxgb8l   20u2sxgb8l  h   dc   oese8fxvj ";
        String[] inputArray = input.split("\\s+");
        List<String> data = Arrays.asList(inputArray);
        Collections.sort(data);

        TreeMap<String, Integer> resMap = new TreeMap<>();
        for (int i = 0; i < data.size(); i++){
            String word = data.get(i);
            int count = resMap.getOrDefault(word, 0);
            resMap.put(word, count+1);
        }
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + ": " + i);
        resMap.forEach(biConsumer);
    }

    public static void main_v3(String[] args) {
        String input="    giej  dn0br8lqph   oese8fxvj   ddy6   dc  dn0br8lqph  dc   bv4396   tpww2v5 dc bbgaw bbgaw yjnkv15 91  dc  20u2sxgb8l   20u2sxgb8l  h   dc   oese8fxvj ";
        List<String> data = Arrays.asList(input.split("\\s+"));
        Collections.sort(data);

        TreeMap<String, Integer> resMap = new TreeMap<>();
        for (int i = 0; i < data.size(); i++){
            String word = data.get(i);
            int count = resMap.getOrDefault(word, 0);
            resMap.put(word, count+1);
        }
        resMap.forEach((s, i) -> System.out.println(s + ": " + i));
    }

    public static void main_v4(String[] args) {
        String input="    giej  dn0br8lqph   oese8fxvj   ddy6   dc  dn0br8lqph  dc   bv4396   tpww2v5 dc bbgaw bbgaw yjnkv15 91  dc  20u2sxgb8l   20u2sxgb8l  h   dc   oese8fxvj ";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : input.trim().split("\\s+")) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> wordsA = new ArrayList<>(map.keySet());
        wordsA.sort(String::compareTo);
        wordsA.forEach(s -> System.out.println(s+": "+map.get(s)));
    }

    public static void main(String[] args) {
        String input="    giej  dn0br8lqph   oese8fxvj   ddy6   dc  dn0br8lqph  dc   bv4396   tpww2v5 dc bbgaw bbgaw yjnkv15 91  dc  20u2sxgb8l   20u2sxgb8l  h   dc   oese8fxvj ";
        Arrays.stream(input.trim().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream()
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
                .forEachOrdered(e -> System.out.println(e.getKey() + ": "+e.getValue()));
    }
}
