package cw180916;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmartStringGenerator {
    private final static char DEFAULT_MIN = 'a';
    private final static char DEFAULT_MAX = 'z';

    private final List<Range> ranges;

    public SmartStringGenerator() {
        this(DEFAULT_MIN, DEFAULT_MAX);
    }

    public SmartStringGenerator(char from, char to){
        this(new Range(from, to));
    }

    public SmartStringGenerator(Range... ranges) {
        this(Arrays.asList(ranges));
    }

    public SmartStringGenerator(List<Range> ranges) {
        this.ranges = Collections.unmodifiableList(ranges);
    }

    List<String> get(int quantity, int minLength, int maxLength) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            String value = generateString(minLength, maxLength);
            strings.add(value);
        }
        return strings;
    }

    private String generateString(int minLength, int maxLength) {
        StringBuilder sb = new StringBuilder();
        int len = new SmartIntegerGenerator().getOne(minLength,maxLength);
        for (int i = 0; i < len; i++) {
            int rangeIndex = new SmartIntegerGenerator().getOne(0, ranges.size()-1);
            Range range = ranges.get(rangeIndex);
            char one = (char) new SmartIntegerGenerator().getOne(range.from(), range.to());
            sb.append(one);
        }
        return sb.toString();
    }

}
