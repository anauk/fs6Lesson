package cw180709.tools;

import cw180709.Cities;
import cw180709.City;

import java.io.*;
import java.util.Map;

public class TimetableGenerator {
    private static final String OUT = "timetable.txt";

    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter(new File(NumberIt.PATH, OUT)));
        final Map<Integer, City> cities = Cities.read();



        w.close();
    }
}
