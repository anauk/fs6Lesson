package cw180709;

import java.io.IOException;
import java.util.Map;

public class ApplicationTimetable {
    public static void main(String[] args) throws IOException {
        Map<Integer, City> read = Cities.read();
        read.forEach((key, city) -> System.out.println(city));
    }
}
