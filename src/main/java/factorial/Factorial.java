package factorial;

public class Factorial {
    private int valueToCalculate;
    private int[] anArray;
    public static int key=5;
    public static int counter=0;

    private static void recursive(int value) {
        int j=value;
        if (value==0) return;
        System.out.println(value);
        recursive(value+1);
        System.out.printf("returned from i:%d\n",value);
    }
    private static void test(int i) {
        System.out.printf("Value is:%d\n", i);
    }
    public static void mainStatic(String[] args) {
        final int VAL=5;
//        anArray = new int[VAL];
        //int anArray = new int[VAL];
        //int f = fact(VAL);
//        System.out.println(f);
    }

    public Factorial(int val) {
        this.valueToCalculate=val;
        this.anArray = new int[val];
        counter++;
    }

    public int run() {
        return fact(valueToCalculate);
    }

    private int fact(int value) {
        if (value<1) return  1;
        int factorial = value * fact(value-1);
        anArray[value-1] = factorial;
        return factorial;
    }

    public void printArray() {
        System.out.printf("Factorial for value %d is %d\n",
                this.valueToCalculate,
                this.anArray[this.anArray.length-1]);
        for (int valueFromArray : this.anArray) {
            System.out.print(valueFromArray+" ");
        }
        System.out.println();
    }
}
