package cw180624.solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class NameReaderWriter {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(
        new FileReader("src/main/java/cw180624/resources/3.names.txt"));

    Set<String> names = new HashSet<>();

    while (reader.ready()) {
      String name = reader.readLine();
      names.add(name);
    }

    // append: true в конструкторе FileWriter - позволяет дописывать информацию в файл, не удаляя из него содержимое, которое там было до этого
    BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/cw180624/resources/unique_names.txt", true));

    for (String name : names) {
      writer.write(name);
      writer.newLine();
    }

//    names.forEach(name -> {
//      writer.write(name);
//      writer.newLine();
//    });

    reader.close();
    writer.close();

    System.out.println(names);
  }
}
