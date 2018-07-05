package algorithms.simples;

import java.util.ArrayList;
import java.util.List;

public class SimpleEasy {
    static int count = 0;
    public static boolean isSimple(int N) {
        for (int i=2; i<N; i++) {
            count++;
            if (N%i==0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> simples = new ArrayList<>();
        for (int i=10000; i<=99999; i++) {
            if (isSimple(i)) {
                simples.add(i);
            }
        }
        System.out.println(simples.size());
        System.out.println(count);
    }
}
