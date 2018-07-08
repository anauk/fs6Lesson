package cw180709.tools;

import cw180709.Cities;
import cw180709.City;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class TimetableGenerator {
    private static final String TIMETABLE_OUT = "timetable.txt";

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File(NumberIt.PATH, TIMETABLE_OUT)));
        final Map<Integer, City> cities = Cities.read();
        Integer max = cities.keySet().stream().max(Comparator.comparingInt(o -> o)).get();


        for (int i = 0; i < cities.size(); i++) {
            String s = String.format(
                    "%d:%d:%d", (int)(Math.random()*max), (int)(Math.random()*max), (int)((Math.random()*60)*10));
            w.write(s);
            w.newLine();
        }


        w.close();
    }
}
