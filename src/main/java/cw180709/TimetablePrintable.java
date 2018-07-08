package cw180709;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class TimetablePrintable {
    private final Map<Integer, City> cities;
    private final Map<String, TimetableEntry> timetable;
    private final int[] widths = {8,50,50,10};
    private final int totalWidth;
    private final String header;
    private final String delimiter;

    public TimetablePrintable(final Cities cities, final Map<String, TimetableEntry> timetable) {
        this.cities = cities.data();
        this.timetable = timetable;
        this.widths[1] = cities.maxLength();
        this.widths[2] = cities.maxLength();
        this.header = generateHeader();
        this.totalWidth = this.header.length();
        this.delimiter = Stream.generate(()->"-").limit(totalWidth).reduce("",(a,b)->(a+b));
    }

    private String format0(int w1, int w2, int w3, int w4) {
        return "%-" + w1 + "s %-" + w2 + "s-> %-" + w3 + "s %" + w4 + "s\n";
    }

    private String format() {
        return format0(widths[0],widths[1],widths[2],widths[3]);
    }

    private void printLine() {
        System.out.println(delimiter);
    }

    private String generateHeader() {
        return String.format(format(), "FlightNo", "From", "To", "Duration");
    }

    private void printHeader() {
        System.out.print(this.header);
    }

    private void printBody() {
        timetable.forEach((s, tte) -> System.out.printf(format(),
                tte.flightNo(),
                cities.get(tte.src()).name(),
                cities.get(tte.dst()).name(),
                tte.durationReadable()));
    }

    public void print() {
        printLine();
        printHeader();
        printLine();
        printBody();
        printLine();
    }
}
