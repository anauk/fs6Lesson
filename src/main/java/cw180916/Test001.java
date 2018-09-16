package cw180916;

import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        List<Integer> randoms1 = new SmartIntegerGenerator().get(100, 0, 1000);
        List<Integer> randoms2 = new SmartIntegerGenerator().get(30, 10, 20);
        //System.out.println(randoms1);
        //System.out.println(randoms2);
        List<String> strings1 = new SmartStringGenerator().get(10, 3, 6);
        System.out.println(strings1);
    }
}
