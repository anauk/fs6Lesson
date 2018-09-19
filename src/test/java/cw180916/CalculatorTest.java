package cw180916;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        assertThat(new Calculator().add(1,3), is(4));
    }

    @Test
    public void sub() {
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
    }

    @Test
    public void mod() {
    }
}