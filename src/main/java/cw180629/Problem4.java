package cw180629;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, ArrayList<String>> collect = new BufferedReader(new FileReader(new File("src/main/java/cw180629", "data3.txt")))
                .lines()
                .map(s -> new Employee(s))
                .collect(Collectors.groupingBy(
                        e -> e.position(),
                        Collectors.mapping(Employee::name,
                                Collectors.toCollection(ArrayList::new))
                ));
        System.out.println(collect);

    }
}
