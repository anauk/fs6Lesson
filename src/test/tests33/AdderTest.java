package tests33;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void test1() {
        TestData t = new TestData(1,1,2);
        assertEquals(t.result(), new Adder(t.val1(), t.val2()).get());
    }

    @Test
    public void test2() {
        TestData testItem = new TestData(1,2,2);
        int d1=testItem.val1();
        int d2=testItem.val2();
        int expected = testItem.result();
        Adder a = new Adder(d1, d2);
        int calculated = a.get();
        assertEquals(expected, calculated);
    }

    @Test
    public void test3() {
        TestData t = new TestData(1,1,2);
        assertEquals(t.result(), new Adder(t.val1(), t.val2()).get());
    }

}