package oop.patterns.facade;

import oop.patterns.facade.was.Class1;

public class Clazz1 implements Driveable {
    private final Class1 element;

    public Clazz1() {
        element = new Class1();
    }

    @Override
    public void print() {
        element.print_a();
    }

    @Override
    public int maxSpeed() {
        return element.maxSpeed();
    }
}
