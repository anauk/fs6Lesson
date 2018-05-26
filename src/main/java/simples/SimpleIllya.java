package simples;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleIllya {

    private static boolean checkForPalindrome(long multiply) {

        String str = String.valueOf(multiply);

        for (int i = 0; i < str.length()/2; i++) {

            if (str.charAt(i) != str.charAt(str.length()-1-i)) {

                return false;

            }

        }

        return true;

    }

    private static ArrayList<Integer> makePrimals(int maxPrimal) {

        List<Integer> primals = new ArrayList<>();

        primals.add(2);

        for (int i = 3; i <= maxPrimal ; i++) {

            boolean flag = true;

            for (int primal: primals) {

                if ( i%primal == 0) {

                    flag = false;

                    break;

                }

            }

            if (flag) {

                primals.add(i);

            }
        }
        return (ArrayList<Integer>) primals;
    }

    public static void main(String[] args) {
        Date start = new Date();

        List<Integer> primals = makePrimals(99999);

        List<Integer> primalsBig = new ArrayList<>();

        for (int item: primals) {

            if (item > 10000) {

                primalsBig.add(item);

            }

        }

        Integer[] arr = new Integer[primalsBig.size()];
        arr = primalsBig.toArray(arr);
        System.out.println(arr.length);
        long max = 0;
        long min = 1;

        for (int i = arr.length-1; i > 0; i--) {

            if( arr[i] < 10000 || arr[i] < min ) {

                break;

            }

            for (int j = arr.length-1; j > 0; j--) {

                if( arr[j] < 10000 || arr[j] < min ) {

                    break;

                }

                long mult = (long) arr[i]* (long) arr[j];

                if (checkForPalindrome(mult)) {

                    if (max/ arr[i]  > arr[j]) {

                        break;

                    }

                    max = Math.max(max, mult);

                    min = Math.max(min, arr[j]);

                    System.out.printf("%d %d %d", arr[i],arr[j],mult);

                    System.out.println();

                }

            }

        }

        System.out.println(max);

        System.out.println();

        Date end = new Date();

        System.out.println("Completed in " + ((end.getTime() - start.getTime()) * 1d / 1000) + " seconds");
    }

}