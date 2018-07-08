package cw180709;

public class TimetableEntry {
    private final String flightNo;
    private final int src;
    private final int dst;
    private final int duration;

    public TimetableEntry(final String flightNo, final int src, final int dst, final int duration) {
        this.flightNo = flightNo;
        this.src = src;
        this.dst = dst;
        this.duration = duration;
    }

    public String flightNo() {
        return flightNo;
    }

    public int src() {
        return src;
    }

    public int dst() {
        return dst;
    }

    public int duration() {
        return duration;
    }

    public String durationReadable() {
        int hours = duration / 60;
        int minuters = duration % 60;
        return String.format("%dh %02dm", hours, minuters);
    }

    @Override
    public String toString() {
        return String.format("TimetableEntry:[No:%s, from:%d, to:%d, duration:%d]",flightNo,src,dst,duration);
    }

    public static void main(String[] args) {
        TimetableEntry tte = new TimetableEntry("AAA", 1, 2, 3);
        System.out.println(tte);
    }
}
