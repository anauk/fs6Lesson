package codegym;

import java.util.*;
import java.util.function.Consumer;

public class MedianOfIntegerSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        while (in.hasNext()) {
            a.add(in.nextInt());
        };
        ArrayList<Integer> medians = new ArrayList<>();
        for (int digitsCount = 1; digitsCount <= a.size(); digitsCount++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < digitsCount; i++) {
                list.add(a.get(i));
            }
            list.sort((i1,i2) -> i2-i1);
            if (digitsCount % 2 == 1) {
                medians.add(list.get(digitsCount/2));
            } else {
                medians.add((list.get(digitsCount/2-1)+list.get(digitsCount/2))/2);
            }
        }
        medians.forEach(integer -> System.out.print(integer + " "));
    }
}
