package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkableImplTest {

    @Test
    public void test01put() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"Alex");
        assertEquals("Alex", w.get(1));
    }

    @Test
    public void test02put() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"Alex");
        w.put(2,"Dima");
        assertEquals("Dima", w.get(2));
    }

    @Test
    public void test03join() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"Alex");
        w.put(2,"Dima");
        assertEquals("AlexDima", w.joinValuesByKeys(1,2));
    }

    @Test
    public void test04join() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"Alex");
        w.put(2,"");
        assertEquals("Alex", w.joinValuesByKeys(1,2));
    }

    @Test
    public void test05join() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"");
        w.put(2,"");
        assertEquals("", w.joinValuesByKeys(1,2));
    }

    @Test
    public void test04contains() {
        WorkableImpl w = new WorkableImpl();
        assertFalse(w.contains(1));
    }

    @Test
    public void test05contains() {
        WorkableImpl w = new WorkableImpl();
        w.put(1,"Alex");
        assertTrue(w.contains(1));
    }
}