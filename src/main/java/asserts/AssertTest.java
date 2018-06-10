package asserts;

public class AssertTest {

    public static void main(String[] args) {
        System.out.println(m1(11));
    }

    private static String m1(int val) {
        assert (val>0 && val<10) : "too bad";

        //if (!(val>0)) throw new AssertionError("too bad");


        return "val="+val;
    }
}
