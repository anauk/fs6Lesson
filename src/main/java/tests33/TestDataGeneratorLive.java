package tests33;

import java.util.Iterator;

public class TestDataGeneratorLive implements Iterable<TestData> {
    public TestDataGeneratorLive() throws Exception {
        boolean noInternet=true;
        if (noInternet) throw new Exception("SIR, NO INTERNET !");
    }

    public TestDataGeneratorLive(String s) {
    }

    @Override
    public Iterator<TestData> iterator() {
        return null;
    }
}
