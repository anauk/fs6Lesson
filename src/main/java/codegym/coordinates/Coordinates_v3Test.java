package codegym.coordinates;

public class Coordinates_v3Test {
    public static boolean compare(String s1,String s2) {
        return s1.equals(s2);
    }

    public static void main0(String[] args) {
        Coordinates_v3 c3 = new Coordinates_v3();
        System.out.printf("test 1: %s\n", compare("A=[0]", c3.find("A")) ? "OK" : "ERR");
    }

    public static void main1(String[] args) {
        Coordinates_v3 c3 = new Coordinates_v3();
        System.out.printf("test 1: %s\n", compare("A=[0], B=[1], C=[2]", c3.find("ABC")) ? "OK" : "ERR");
    }

    public static void main2(String[] args) {
        Coordinates_v3 c3 = new Coordinates_v3();
        String expected = "T=[0], e=[9], g=[18], h=[1], i=[2, 5, 16], n=[17], r=[15], s=[3, 6, 10, 13], t=[8, 11, 14]";
        String calculated = c3.find("This is test string");
        System.out.printf("test 2: %s\n", compare(expected, calculated) ? "OK" : "ERR");
    }

    public static void main4(String[] args) {
        Coordinates_v3 c3 = new Coordinates_v3();
        System.out.printf("test 4: %s\n", compare("", c3.find("")) ? "OK" : "ERR");
    }

    public static void main(String[] args) {
        main0(args);
        main1(args);
        main2(args);
        main4(args);
    }
}
