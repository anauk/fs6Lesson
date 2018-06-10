package codegym.coordinates;

import org.junit.Test;

import static org.junit.Assert.*;

public class Coordinates_v3Test {

    @Test
    public void main0() {
        Coordinates_v3 c3 = new Coordinates_v3();
        assertEquals(
                "A=[0]",
                c3.find("A")
        );
    }

    @Test
    public void main1() {
        Coordinates_v3 c3 = new Coordinates_v3();
        assertEquals(
                "A=[0], B=[1], C=[2]",
                c3.find("ABC")
        );
    }

    @Test
    public void main2() {
        Coordinates_v3 c3 = new Coordinates_v3();
        assertEquals(
                "T=[0], e=[9], g=[18], h=[1], i=[2, 5, 16], n=[17], r=[15], s=[3, 6, 10, 13], t=[8, 11, 14]",
                c3.find("This is test string")
        );
    }

}