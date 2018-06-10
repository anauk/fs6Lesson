package tdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImaginationOne {
    public List<Integer> sort1(int i1, int i2) {
/*
        ArrayList<Integer> al = new ArrayList<>();
        if (i1<i2) {
            al.add(i1);
            al.add(i2);
        } else {
            al.add(i2);
            al.add(i1);
        }
        return al;
*/
        return sort3(i1,i2);
    }

    public List<Integer> sort2(int[] items) {
        return Arrays.stream(items).boxed().sorted().collect(Collectors.toList());
    }

    public List<Integer> sort3(int... items) {
        return sort2(items);
    }
}
