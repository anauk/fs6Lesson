package core.enums;

public class MonthsLongTest {
    public static void waitFor_millis(long time) {

    }

    public static void waitFor(long time, TimeType type) {
        long realtime;
        switch (type) {
            case MILLIS: realtime = time;
                break;
            case SECONDS:realtime = time*1000;
                break;
            case MINUTES: realtime = time*1000*60;
                break;
            case HOURS: realtime = time*1000*60*60;
                break;
            default:
                throw new IllegalArgumentException("unsupported type");
        }
        waitFor_millis(realtime);
    }

    public static void main(String[] args) {
        MonthsLong m1;
        m1= MonthsLong.January;
        if (m1== MonthsLong.February) {

        }

        waitFor_millis(350); // 350 ms
        waitFor_millis(5*1000); // 5 sec
        waitFor_millis(3*60*1000); // 3 min
        waitFor_millis(3*60*60*1000); // 3 hour

        waitFor(350, TimeType.MILLIS); // 350 ms
        waitFor(5, TimeType.SECONDS); // 5 sec
        waitFor(4, TimeType.MINUTES); // 4 min
        waitFor(3, TimeType.HOURS); // 3 hour
    }
}
