package oop.abstracts;

import oop.abstracts.interfaces.Identifable00;
import oop.abstracts.interfaces.Nameable00;
import oop.abstracts.interfaces.AbstractPerson;
import oop.abstracts.interfaces.Thinkable00;

public class Person33 extends AbstractPerson implements Identifable00, Thinkable00, Nameable00 {
    private final int id;
    private final String name;

    public Person33(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int dna() {
        return 333;
    }

    @Override
    public void think() {
        System.out.println("I'm thinking");
    }
}
