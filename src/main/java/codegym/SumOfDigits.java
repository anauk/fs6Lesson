package codegym;

import java.util.*;

public class SumOfDigits {
    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        count(number);
    }

    public static void count(int number) {
       int sum = 0;
        String digits = String.valueOf(number);
        int len = digits.length();
        for (int i = 0; i < len ; i++) {
            int digit = digits.charAt(i) - '0';
            sum+=digit;
        }

        System.out.printf("%d %d", len, sum);
    }


    public static void main4(String[] args) {
        String s1="123";

        String s2=s1+"1";
        System.out.printf("this is string: %s\n",s1);
        System.out.printf("this is string: %s\n",s2);

        int val1 = Integer.parseInt(s1);
        System.out.printf("this is int: %d\n",val1);

        int val2 = Integer.parseInt(s2);
        System.out.printf("this is int: %d\n",val2);
        val2++;
        System.out.printf("this is int: %d\n",val2);
    }

    public static void main(String[] args) {
        String s1="ABC";
        String s2="BBD";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

        s1="ZBC";
        s2="BBD";
        System.out.println(s1.compareTo(s2));

        s1="QWE";
        s2="QWE";
        System.out.println(s1.compareTo(s2));

        s1="QWE";
        s2="qwe";
        System.out.println(s1.compareToIgnoreCase(s2));

        s1="hello world!";
        System.out.println(s1.contains("world"));
        System.out.println(s1.contains("Hello"));

        System.out.println(s1.endsWith("hell"));
        System.out.println(s1.startsWith("hell"));
        System.out.println(s1.startsWith("!"));

        System.out.println(s1.indexOf("world"));
        s2="";
        System.out.println(s2.isEmpty());

        s1="qwe:rty:uio";
        String[] splitted = s1.split(":");

        for (int i = 0; i < splitted.length; i++) {
            System.out.printf("item is %s\n", splitted[i]);
        }

        for (String s : splitted) {
            System.out.printf("item is %s\n", s);
        }
        int index=0;
        while (index < splitted.length) {
            System.out.printf("item is %s\n", splitted[index]);
            index++;
        }
        index=0;
        while (true) {
            System.out.printf("item is %s\n", splitted[index++]);
            if (index >= splitted.length) break;
        }

        s1="HeLLo ! Word !";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(6,14));
        s1="     \t \n  zxc  \t   ";
        System.out.println("_"+s1.trim()+"_");
    }
}