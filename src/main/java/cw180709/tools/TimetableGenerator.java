package cw180709.tools;

import java.util.stream.Stream;

public class TimetableGenerator {
    public static final String TIMETABLE_OUT = "timetable.txt";

    private static int city(int max) {
        return (int)(Math.random()*max+1);
    }

    private static int length() {
        return (int)(Math.random()*60)*10;
    }

    private static String flightNo() {
        return Stream.generate(() -> (char)(Math.random()*26+65))
                .map(String::valueOf)
                .limit(4).reduce("", (a,b)->(a+b));
    }
}
