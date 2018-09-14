package cw180914;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DataReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/main/java/cw180914/str.txt")));
        ArrayList<Integer> integers = new ArrayList<>();
        while (bufferedReader.ready()) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        List<Integer> even = integers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = integers.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toList());
        BufferedWriter bufferedEvenWriter = new BufferedWriter(new FileWriter(new File("src/main/java/cw180914/even.txt")));
        BufferedWriter bufferedOddWriter = new BufferedWriter(new FileWriter(new File("src/main/java/cw180914/odd.txt")));
        System.out.println(integers);
        for (int i : even) {
            bufferedEvenWriter.write(Integer.toString(i));
            bufferedEvenWriter.write("\n");
        }
        bufferedEvenWriter.close();
        for (int i : odd) {
            bufferedOddWriter.write(Integer.toString(i));
            bufferedOddWriter.write("\n");
        }
        bufferedOddWriter.close();
    }
}
