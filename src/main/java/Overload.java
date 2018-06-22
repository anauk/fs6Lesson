import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Overload {
    private final int a1;
    private final int b1;
    private final int c1;
    private final int d1;

    public static Overload buildABCD(int a, int b, int c, int d) {
        return new Overload(a,b,c,d);
    }

    public static Overload build1234() {
        return new Overload(1,2,3,4);
    }

    public Overload() {
        this(1, 2,3,4);
    }

    public Overload(int a, int b) {
        this(a, b,3,4);
    }

    public Overload(int a, int b, int c) {
        this(a,b,c,4);
    }

    public Overload(int a, int b, int c, int d) {
        this.a1=a;
        this.b1=b;
        this.c1=c;
        this.d1=d;
    }

    public int add (int a, int b, int c){
        return a+b+c;
    }

    public int add (int a, int...others){
        int sum = a;
        for (int other : others) {
            sum += other;
        }
        return sum;
    }

    public int add51(List<Integer> origin) {
        int result = 0;
        for(int i = 0; i < origin.size(); i++){
            result = result + origin.get(i);
        }
        return result;
    }

    public int add52(List<Integer> origin) {
        final int[] result = {0};
        origin.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                result[0] +=integer;
            }
        });
        return result[0];
    }

    int result2 = 0;

    void increment(int val) {
        result2 = result2 + val;
    }

    public int add53(List<Integer> origin) {
        origin.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                increment(integer);
            }
        });
        return result2;
    }

    public int add54(List<Integer> origin) {
        return origin.stream().reduce((a, val) -> a + val).get();
    }


    public int add(int a, int b) {
        return a+b;
    }

    public int add41 (int a, int b, int c, int d){
        return a+b+c+d;
    }

    public int add42 (int a, int b, int c, int d){
        return add(add(a,b,c), d);
    }

    public static int add1(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Overload o1 = new Overload(1, 2, 3, 4);
        Overload o2 = Overload.buildABCD(1,2,3,4);

        Overload instance = new Overload();
        Overload o3 = Overload.build1234();



        int b = instance.add(1, 2);
        int c = add1(1,2);
        int d = instance.add(1,2, 3);

        int e = instance.add(1,2, 3, 4);

        System.out.println(instance.add(1));
        System.out.println(instance.add(1,2));

        int i9 = instance.add(1,2,3,4,5,6,7,8,9);

    }

}
