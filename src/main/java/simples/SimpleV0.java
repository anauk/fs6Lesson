package simples;

public class SimpleV0 {

    public static boolean isSimple(int number) {
        boolean issimple=true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                issimple=false;
                break;
            }
        }
        return issimple;
    }

    public static void main(String[] args) {
        System.out.println(isSimple(69143));
        System.out.println(isSimple(91009));
    }
}
