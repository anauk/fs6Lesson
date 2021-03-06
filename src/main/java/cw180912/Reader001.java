package cw180912;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/cw180912/str.txt")));
        ArrayList<String> strings = new ArrayList<>();
        Stream<String> lines = br.lines();

        Map<Integer, List<String>> collect = lines.collect(Collectors.groupingBy(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }, Collectors.toList()));

/*
        collect.forEach(new BiConsumer<Integer, List<String>>() {
            @Override
            public void accept(Integer key, List<String> strings) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(String.format("src/main/java/cw180912/%d.txt", key))));
                    strings.forEach(s -> {
                        try {
                            bw.write(s);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
*/

        while (br.ready()) {
            strings.add(br.readLine());
        }

        HashMap<Integer, ArrayList<String>> items = new HashMap<>();

        // canonical version, v.0
        for (String s : strings) {
            int len = s.length();
            if (!items.containsKey(len)) {
                ArrayList<String> al = new ArrayList<>();
                al.add(s);
                items.put(len, al);
            } else {
                ArrayList<String> al = items.get(len);
                al.add(s);
            }
        }

       items.entrySet().forEach(new Consumer<Map.Entry<Integer, ArrayList<String>>>() {
            @Override
            public void accept(Map.Entry<Integer, ArrayList<String>> el) {
                try {
                    Integer key = el.getKey();
                    ArrayList<String> strings = el.getValue();
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(String.format("src/main/java/cw180912/%d.txt", key))));
                    strings.forEach(new Consumer<String>() {
                        @Override
                        public void accept(String s) {
                            try {
                                bw.write(s);
                                bw.write("\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println(items);
    }
}