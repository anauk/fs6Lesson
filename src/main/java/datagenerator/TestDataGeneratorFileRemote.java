package datagenerator;

import java.util.Iterator;

public class TestDataGeneratorFileRemote implements Iterable<TestData> {
    public TestDataGeneratorFileRemote() throws Exception {
        boolean noInternet=true;
        if (noInternet) throw new Exception("SIR, NO INTERNET !");
    }

    public TestDataGeneratorFileRemote(String s) {


    }

    @Override
    public Iterator<TestData> iterator() {
        return null;
    }
}
