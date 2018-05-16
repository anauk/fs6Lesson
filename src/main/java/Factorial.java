public class Factorial {

    private int valueToCalculate;
    private int[] anArray;

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

    Factorial(int val) {
        this.valueToCalculate=val;
        anArray = new int[val];
    }

    public static void main(String[] args) {
        final int VAL=5;
        Factorial factorial = new Factorial(VAL);
        int calculated=factorial.fact();
        System.out.println(calculated);
        factorial.printArray();
    }

    public int fact() {
        return fact(valueToCalculate);
    }

    public int fact(int value) {
        if (value<1) return  1;
        int factorial = value*fact(value-1);
        anArray[value-1] = factorial;
        return factorial;
    }

    public void printArray() {
        for (int valueFromArray : anArray) {
            System.out.println(valueFromArray);
        }
    }
}
