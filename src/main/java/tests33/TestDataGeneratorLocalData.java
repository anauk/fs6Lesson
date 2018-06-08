package tests33;

import java.util.Iterator;

public class TestDataGeneratorLocalData implements Iterable<TestData> {
    private TestData[] data = {
            new TestData(1,1,2),
            new TestData(10,20,30),
            new TestData(5,-5,0),
            new TestData(5,6,12),
            new TestData(-1,-2,-3)
    };

    @Override
    public Iterator<TestData> iterator() {
        return new Iterator<TestData>() {
            int index = 0;
            int len = data.length;

            @Override
            public boolean hasNext() {
                if (index < len) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public TestData next() {
                return data[index++];
            }
        };
    }

}
