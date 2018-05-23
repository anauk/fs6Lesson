package codegym;

import java.util.*;

public class ArrayListSort1 {
    public static void main(String[] args) {
        String input="15\n" +
                "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
        Scanner in = new Scanner(
                input
                //System.in
        );
        int N = in.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                if (n1 % 2 == 0 && n2 % 2 == 0) {
                    return n1-n2;
                }
                if (n1 % 2 != 0 && n2 % 2 != 0) {
                    return n2-n1;
                }
                if (n1 % 2 == 0 && n2 % 2 != 0) {
                    return -1;
                }
                if (n1 % 2 != 0 && n2 % 2 == 0) {
                    return 1;
                }
                return 0;
            }
        };

        Collections.sort(list, comp);

        System.out.println(list);
    }
}
