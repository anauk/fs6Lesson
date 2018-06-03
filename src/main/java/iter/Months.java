package iter;

import java.util.Iterator;

public class Months implements Iterable<String>{
    private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            int index = 0;
            int len = months.length;

            @Override
            public boolean hasNext() {
                if (index < len) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public String next() {
                return months[index++];
            }
        };
        return it;
    }
}
