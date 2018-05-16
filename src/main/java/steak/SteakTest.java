package steak;

public class SteakTest {
    public static void main(String[] args) {

        Steak s1 = new Steak("Well Done");
        System.out.println(s1.name());
        System.out.println(s1.price());

        Steak s2 = new Steak("Rare");
        System.out.println(s2.name());
        System.out.println(s2.price());

        Steak s3 = new Steak("Medium");
        System.out.println(s3.name());
        System.out.println(s3.price());

        Steak s4 = new Steak("I don't know;)");
        System.out.println(s4.name());
        System.out.println(s4.price());

        s1.prepare();
        int size4 = s4.size();






    }
}
