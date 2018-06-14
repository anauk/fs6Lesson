package oop.patterns.factory;

import java.util.Scanner;

public class WorkTest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1 :
                Worker1 w1 = new Worker1();
                w1.work();
                break;
            case 2 :
                Worker2 w2 = new Worker2();
                w2.work();
                break;
            case 3 :
                Worker3 w3 = new Worker3();
                w3.work();
                break;
            default: throw new IllegalArgumentException("__unsupported value");
        }
    }
}
