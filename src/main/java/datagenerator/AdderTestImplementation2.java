package datagenerator;

public class AdderTestImplementation2 {

    public static boolean test1(int expected, int calculated) {
        if (expected == calculated){
            return true;
        } else {
            return false;
        }
        //return expected == calculated;
    }

    public static void main0(String[] args) {
        Adder a = new Adder(1,2);
        System.out.println(test1(a.get(),3) ? "OK" : "ERROR");
    }

    public static void main4(String[] args) {
        TestData[] data = {
                new TestData(1,1,2),
                new TestData(10,20,30),
                new TestData(5,-5,0),
                new TestData(5,6,12),
                new TestData(-1,-2,-3)
        };
        for (TestData testItem : data) {
            int d1=testItem.val1();
            int d2=testItem.val2();
            int expected = testItem.result();

            Adder a = new Adder(d1, d2);
            int calculated = a.get();

            boolean result = test1(expected, calculated);

            System.out.println(result ? "OK" : "ERROR");
        }
    }

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        for (TestData testItem : provider.get()) {
            int d1=testItem.val1();
            int d2=testItem.val2();
            int expected = testItem.result();

            Adder a = new Adder(d1, d2);
            int calculated = a.get();

            boolean result = test1(expected, calculated);

            System.out.println(result ? "OK" : "ERROR");
        }
    }

    public static void main5(String[] args) {
        TestDataGeneratorLocalData testGen = new TestDataGeneratorLocalData();
        for (TestData testItem : testGen) {
            int d1=testItem.val1();
            int d2=testItem.val2();
            int expected = testItem.result();

            Adder a = new Adder(d1, d2);
            int calculated = a.get();

            boolean result = test1(expected, calculated);

            System.out.println(result ? "OK" : "ERROR");
        }
    }

    public static void main2(String[] args) {
        System.out.println(new TestData(1,2,3));
    }

}
