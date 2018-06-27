package cw180624.solutions;

import java.util.ArrayList;
import java.util.List;

public class Strings {
  public static void main(String[] args) {
    String line = "LOREM i dolor sit amet";

    String[] words = line.split(" ");

    for (String word : words) {
      if (word.length() > 1) {
//        Character.toUpperCase(word.charAt(0))
        System.out.print(word.substring(0, 1).toUpperCase());
        System.out.print(word.substring(1).toLowerCase());
        System.out.print(" ");
      } else {
        System.out.print(word);
        System.out.print(" ");
      }
    }
  }
}
