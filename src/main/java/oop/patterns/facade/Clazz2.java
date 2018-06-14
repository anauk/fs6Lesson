package oop.patterns.facade;

import oop.patterns.facade.was.Class2;

public class Clazz2 implements Driveable {
    private final Class2 element;

    public Clazz2() {
        element = new Class2();
    }

    @Override
    public void print() {
        element.print_b(0);
    }

    @Override
    public int maxSpeed() {
        return element.getMax();
    }
}
