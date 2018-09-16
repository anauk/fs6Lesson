package cw180916;

import java.util.ArrayList;
import java.util.List;

public class SmartIntegerGenerator {

    public List<Integer> get(int quantity, int from, int to) {
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            int value = getOne(from, to);
            randoms.add(value);
        }
        return randoms;
    }

    public int getOne(int from, int to){
        final int RANGE = to - from + 1;
        double rand1 = Math.random(); // 0 <= ... < 1
        double rand2 = rand1 * RANGE; // 0 <= ... < RANGE
        double rand3 = rand2 + from; // from <= ... < to
        return (int) rand3;
    }
}


