package java8.opt;

public class C2 extends C1 {
    static void m1(){
        System.out.println("c2");
    }

    //abstract static void m2(){}

    public static void main1(String[] args) {
        C1.m1();
        C2.m1();
    }

    public static void main(String[] args) {

    }
}
