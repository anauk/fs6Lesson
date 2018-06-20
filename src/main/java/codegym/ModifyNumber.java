package codegym;

import java.util.Scanner;

public class ModifyNumber {
    public static void main_explained(String[] args) {
        String input="2147483647 31";
        Scanner in = new Scanner(input/*System.in*/);
        int val = in.nextInt();
        int bit_number = in.nextInt();

        System.out.println("input (10):"+val);
        System.out.println("input (2) :"+Integer.toBinaryString(val));
        System.out.println("bit number:"+bit_number);
        int mask = 1<<(bit_number-1);
        System.out.println("bit mask  :"+Integer.toBinaryString(mask));
        int not_mask = ~mask;
        System.out.println("not mask  :"+Integer.toBinaryString(not_mask));
        int new_val = val & not_mask;
        System.out.println("new val(2):"+Integer.toBinaryString(new_val));
        System.out.println("newval(10):"+new_val);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int bit_number = in.nextInt();

        int mask = 1<<(bit_number-1);
        int new_val = val & ~mask;
        System.out.println(new_val);
    }
}
