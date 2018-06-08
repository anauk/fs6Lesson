package tests33;

public class DataProvider {
    public Iterable<TestData> get() {
        return
                new TestDataGenerator();
        //new TestDataGeneratorFromFile();
    }
}
