package cw180912;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Reader001 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(new File("src/main/java/cw180912/str.txt")));
    ArrayList<String> strings = new ArrayList<>();
    while (br.ready()) {
      strings.add(br.readLine());
    }
    HashMap<Integer, ArrayList<String>> items = new HashMap<>();

    strings.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        int len = s.length();
        ArrayList<String> al = items.get(len);
        if (al == null) {
          al = new ArrayList<>();
          items.put(len, al);
        }
        al.add(s);
      }
    });




    System.out.println(items);
  }
}
