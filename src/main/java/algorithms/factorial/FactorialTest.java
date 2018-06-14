package algorithms.factorial;

public class FactorialTest {
    public static void main(String[] args) {
        Factorial factorial5 = new Factorial(5);
        //System.out.println(factorial5.counter);
        Factorial factorial6 = new Factorial(6);
        //System.out.println(factorial6.counter);

/*
        System.out.println(factorial5.key);;
        System.out.println(factorial6.key);;

        factorial5.key=11;
        System.out.println(factorial6.key);
*/

        factorial5.run();
        factorial6.run();

        factorial5.printArray();
        factorial6.printArray();
    }
}