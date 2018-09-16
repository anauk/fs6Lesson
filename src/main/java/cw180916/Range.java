package cw180916;

public class Range {
    private final char from;
    private final char to;

    public Range(char from, char to) {
        this.from = from;
        this.to = to;
    }

    public char from() {
        return this.from;
    }

    public char to() {
        return this.to;
    }

    @Override
    public String toString() {
        return String.format("Range{from=%s, to=%s}", from, to);
    }
}
