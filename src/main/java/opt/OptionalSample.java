package opt;

public class OptionalSample {
    public static void printIfHas(Optional2 opt) {
        System.out.print(opt.has()+" ");
        if (opt.has()) {
            System.out.println(opt.get());
        } else
            System.out.println();
    }

    public static void main3(String[] args) {
        Optional2 o1 = new Optional2.Empty();
        Optional2 o11 = new OEmpty();

        Optional2 o2 = new Optional2.Value(100);
        printIfHas(o1);
        printIfHas(o11);
        printIfHas(o2);

        System.out.println(new String("ABC"));

        String s = new String("ABC");
        System.out.println(s);
    }


}
