package tests33;

import java.io.*;
import java.util.Iterator;

public class TestDataGeneratorFileLocal implements Iterable<TestData> {
    public TestDataGeneratorFileLocal(String s) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(new File(s)));
        int read = reader.read();
    }

    @Override
    public Iterator<TestData> iterator() {
        return null;
    }
}
