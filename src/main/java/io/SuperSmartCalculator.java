package io;

import java.io.InputStream;
import java.util.Scanner;

public class SuperSmartCalculator {
    private final InputStream is;

    public SuperSmartCalculator(InputStream is) {
        this.is = is;
    }

    public int calculator() {
        Scanner in = new Scanner(is);
        int val1 = in.nextInt();
        int val2 = in.nextInt();
        return val1+val2;
    }
}
