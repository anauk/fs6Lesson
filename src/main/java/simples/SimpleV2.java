package simples;

import java.util.Scanner;

public class SimpleV2 {

    static int[] getSimples(int min, int max) {
        int[] ints = new int[max - min + 1];
        int index=0;
        for (int i = min; i <=max ; i++) {
            if (isSimple(i)) {
                ints[index++]=i;
            }
        }
        int[] intsShort = new int[index];
        System.arraycopy(ints,0,intsShort,0,index);
        return intsShort;
    }

    static boolean isSimple(long number) {
        return isSimple((int)number);
    }

    static boolean isSimple(int number) {
        boolean simple = true;
        for (int i = 2; i <= number-1; i++) {
            if(number%i ==0){simple=false;
                break;
            }
        }
        return simple;
    }

    static int maximumNumber() {
        System.out.print("Enter maximum number: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void main (String[]args){
        int N = maximumNumber();
        for (int index = 1; index <= N; index++) {
            System.out.print( isSimple(index)?index + " ":"");
        }
    }
}
