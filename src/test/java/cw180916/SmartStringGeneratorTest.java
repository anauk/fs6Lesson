package cw180916;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class SmartStringGeneratorTest {

    @Test
    public void test001() {
        List<String> strings = new SmartStringGenerator('A', 'Z').get(20, 2, 5);
        assertThat(strings, hasSize(20));
    }

    @Test
    public void test002() {
        List<String> strings = new SmartStringGenerator('A', 'Z').get(20, 2, 5);
        assertThat(strings, not(hasItem("11")));
    }

    @Test
    public void test003() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        assertThat(al, hasSize(3));
        assertThat(al, contains(1,2,3));
    }

    @Test
    public void test004() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        assertThat(al, hasSize(3));
        assertThat(al, containsInAnyOrder(2,3,1));
    }

    @Test
    public void test005() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        assertThat(al, hasSize(3));
        assertThat(al, hasItem(1));
        assertThat(al, hasItems(1,2));
    }

    @Test
    public void test006() {
        assertThat("Hello", startsWith("He"));
        assertThat("Hello", endsWith("llo"));
    }

    @Test
    public void test007() {
        assertThat(42, is(42));
    }

    @Test
    public void get32() {
        assertThat(1, is(1));
    }
    @Test
    public void get321() {
        assertThat(1, equalTo(1));
    }

    @Test
    public void get33() {
        assertThat(1, is(not(0)));
    }

    @Test
    public void get331() {
        assertThat("test", anyOf(is("test"), is("test1")));
    }

    @Test
    public void get332() {
        assertThat("test", anyOf(is("test"), containsString("est")));
    }

    @Test
    public void get333() {
        assertThat("test", anyOf(containsString("est")));
    }

    @Test
    public void get334() {
        assertThat("test", allOf(containsString("te"), containsString("st")));
    }

    @Test
    public void get500() {
        assertThat(Long.valueOf(1L), instanceOf(Long.class));
    }

    @Test
    public void get501() {
        assertThat(Long.valueOf(1L), isA(Long.class));
    }

    @Test
    public void get600() {
        assertThat(Arrays.asList(1,2,3), hasItem(1)); // one item
    }

    @Test
    public void get6001() {
        assertThat(Arrays.asList(1,2,3), not(hasItem(0))); // one item
    }

    @Test
    public void get601() {
        assertThat(Arrays.asList(1,2,3), hasItems(1,2)); // several items
    }

    @Test
    public void get6011() {
        assertThat(Arrays.asList(1,2,3), contains(1,2,3)); // ALL, strict order !
    }

    @Test
    public void get6012() {
        assertThat(Arrays.asList(1,2,3), containsInAnyOrder(3,1,2)); // ALL, order non strict
    }

    @Test
    public void get6013() {
        assertThat(Arrays.asList(1,2,3), containsInRelativeOrder(2,3)); // NOT ALL, partial, but in order
    }

    @Test
    public void get6014() {
        assertThat(Arrays.asList(1,2,3), not(contains(4)));
    }

    @Test
    public void get602() {
        assertThat(Arrays.asList(1,2,3), hasSize(3));
    }

    @Test
    public void get6021() {
        assertThat(Arrays.asList(1,2,3), not(empty()));
    }

    @Test
    public void get6022() {
        assertThat(Arrays.asList(1,2,3), iterableWithSize(3));
    }

    @Test
    public void get6023() {
        assertThat(Arrays.asList(1,2,3), everyItem(lessThan(10)));
    }

    @Test
    public void get6024() {
        assertThat(Arrays.asList(1,2,3), everyItem(greaterThan(0)));
    }

    @Test
    public void get6025() {
        assertThat(Arrays.asList(1,2,3), everyItem(greaterThanOrEqualTo(1)));
    }

    @Test
    public void get603() {
        assertThat(Arrays.asList(), empty());
    }

    @Test
    public void get604() {
        assertThat(Arrays.asList(), equalTo(Collections.EMPTY_LIST));
    }

    @Test
    public void get700() {
        String[] array = new String[] { "ab" };
        assertThat(array, not(emptyArray()));
    }

    @Test
    public void get701() {
        String[] array = new String[] {};
        assertThat(array, emptyArray());
    }

    @Test
    public void get800() {
        Object o = new Object() {
            @Override
            public String toString() {
                return "magic";
            }
        };
        assertThat(o, hasToString("magic"));
    }

    @Test
    public void get801() {
        String s1 = new String("s1");
        assertThat(s1.getClass(), typeCompatibleWith(String.class));
    }

    @Test
    public void get802() {
        String s1 = new String("s1");
        assertThat(s1.getClass(), typeCompatibleWith(Object.class));
    }

    @Test
    public void get803() {
        Object o = new Object() {
            public int getId() {
                return 1;
            }
        };
        assertThat(o, hasProperty("id"));
    }

    @Test
    public void get900() {
        HashMap<Integer, String> m = new HashMap<Integer, String>() {{
            put(1, "a");
            put(2, "b");
        }};
        assertThat(m, hasEntry(1, "a"));
    }

}