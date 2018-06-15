package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SuperSmartCalculatorTest {
    public static void main1(String[] args) {
        SuperSmartCalculator ssc = new SuperSmartCalculator(
                System.in);
        int calculated = ssc.calculator();
        System.out.println(calculated);
    }

    public static void main(String[] args) throws FileNotFoundException {
        SuperSmartCalculator ssc = new SuperSmartCalculator(
                new StreamFromArrayList(new ArrayList<Integer>(){{add(22);add(44);}}));
        int calculated = ssc.calculator();
        System.out.println(calculated);
    }

    public static void main33(String[] args) throws FileNotFoundException {
        SuperSmartCalculator ssc = new SuperSmartCalculator(
                new FileInputStream("input/1.txt"));
        int calculated = ssc.calculator();
        System.out.println(calculated);
    }
}
