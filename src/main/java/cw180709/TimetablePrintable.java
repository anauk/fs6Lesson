package cw180709;

import java.util.Map;
import java.util.stream.Stream;

public class TimetablePrintable {
    private final Map<Integer, City> cities;
    private final Map<String, TimetableEntry> timetable;
    private final int[] widths = {8, 0, 0};
    private final String header;
    private final String delimiter;

    public TimetablePrintable(final Cities cities, final Map<String, TimetableEntry> timetable) {
        this.cities = cities.data();
        this.timetable = timetable;
        this.widths[1] = cities.maxLength();
        this.widths[2] = cities.maxLength();
        this.header = generateHeader();
        final int totalWidth = this.header.length();
        System.out.println(totalWidth);
        this.delimiter = Stream.generate(()->"-").limit(totalWidth).reduce("",(a, b)->(a+b));
    }

    private String format0(int w1, int w2, int w3) {
        return "%-" + w1 + "s %-" + w2 + "s-> %-" + w3 + "s %s";
    }

    private String format() {
        return format0(widths[0],widths[1],widths[2]);
    }

    private String generateHeader() {
        return String.format(format(), "FlightNo", "From", "To", "Duration");
    }

    private void printLine() {
        System.out.println(delimiter);
    }

    private void printHeader() {
        System.out.println(this.header);
    }

    private void printBody() {
        timetable.forEach((s, tte) -> System.out.printf(format()+"\n",
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
