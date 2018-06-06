package tests;

import codegym.coordinates.Coordinates_v2;
import org.junit.Test;

import static org.junit.Assert.*;

public class Coordinates_v2Test {
    @Test
    public void test0() {
        assertEquals("",new Coordinates_v2().find(""));
    }

    @Test
    public void test1() {
        assertEquals("A=[0]",new Coordinates_v2().find("A"));
    }

    @Test
    public void test2() {
        assertEquals("A=[0], B=[1]",new Coordinates_v2().find("AB"));
    }

    @Test
    public void test3() {
        assertEquals("A=[0], B=[1, 2]",new Coordinates_v2().find("ABB"));
    }

    @Test
    public void test5() {
        Coordinates_v2 c2 = new Coordinates_v2();
        assertEquals(
                "T=[0], e=[9], g=[18], h=[1], i=[2, 5, 16], n=[17], r=[15], s=[3, 6, 10, 13], t=[8, 11, 14]",
                c2.find("This is test string")
        );
    }
}