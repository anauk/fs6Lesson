package patterns;

public class WorkFactory {
    public static void main(String[] args) {
        Worker1 w1 = new Worker1();
        if (w1 instanceof Worker1) {
            System.out.println("+");
        }
        if (w1 instanceof Workable) {
            System.out.println("+");
        }
    }

    public static Workable build(int val) {
        Workable w;
        switch (val) {
            case 1 :
                w = new Worker1();
                break;
            case 2 :
                w = new Worker2();
                break;
            case 3 :
                w = new Worker3();
                break;
            default: throw new IllegalArgumentException("__unsupported value");
        }
        return w;
    }
}
