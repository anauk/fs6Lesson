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
        List<String> strings2 = new SmartStringGenerator('a', 'b').get(10, 3, 6);
        System.out.println(strings2);
        List<String> strings3 = new SmartStringGenerator(
                new Range('a', 'z'), new Range('A', 'D'), new Range('O', 'Z'))
                .get(10, 3, 6);
        System.out.println(strings3);
    }
}
