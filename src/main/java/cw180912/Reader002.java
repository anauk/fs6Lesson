package cw180912;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Reader002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/cw180912/str.txt")));
        ArrayList<String> strings = new ArrayList<>();

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

        // v1
/*
        for (String s : strings) {
            int len = s.length();
            ArrayList<String> al = items.get(len);
            if (al == null) {
                al = new ArrayList<>();
                items.put(len, al);
            }
            al.add(s);
        }
*/
        // v2
/*
        for (String s : strings) {
            items.getOrDefault(s.length(), new ArrayList<>()).add(s);
        }
*/

        // v3
/*
        strings.forEach(s -> items.computeIfAbsent(s.length(), k -> new ArrayList<>()).add(s));
*/
        // v4
/*
        strings
                .forEach(s -> items.getOrDefault(s.length(), new ArrayList<>()).add(s));
*/

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
