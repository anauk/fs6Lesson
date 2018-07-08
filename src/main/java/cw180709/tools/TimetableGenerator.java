package cw180709.tools;

import cw180709.Cities;
import cw180709.City;

import java.io.*;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TimetableGenerator {
    private static final String TIMETABLE_OUT = "timetable.txt";

    private static int city(int max) {
        return (int)(Math.random()*max+1);
    }

    private static int length() {
        return (int)(Math.random()*60)*10;
    }

    private static String flightNo() {
        return Stream.generate(new Supplier<Character>() {
            @Override
            public Character get() {
                return (char)(Math.random()*26+65);
            }
        })
                .map(x->String.valueOf(x))
                .limit(4).reduce("", (a,b)->(a+b));
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File(NumberIt.PATH, TIMETABLE_OUT)));
        final Map<Integer, City> cities = Cities.read();
        Integer max = cities.keySet().stream().max(Comparator.comparingInt(o -> o)).get();
        max--;

        for (int i = 0; i < cities.size(); i++) {
            w.write(String.format("%s:%d:%d:%d", flightNo(), city(max), city(max), length()));
            w.newLine();
        }

        w.close();
    }
}
