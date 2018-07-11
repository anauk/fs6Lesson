package cw180709;

import java.io.IOException;
import java.util.Map;

public class ApplicationTimetable {
    public static void main(String[] args) throws IOException {
        Cities cities = new Cities();
        //cities.forEach((key, city) -> System.out.println(city));

        Map<String, TimetableEntry> timetable = new Timetable().read();
        //timetable.forEach((s, tte) -> System.out.println(tte));

        TimetablePrintable ttp = new TimetablePrintable(cities, timetable);
        ttp.print();

    }
}
