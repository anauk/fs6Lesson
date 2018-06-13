package io;

public class Person33 extends Person00 implements Identifable00, Thinkable00, Nameable00{
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
    int dna() {
        return 333;
    }

    @Override
    public void think() {
        System.out.println("I'm thinking");
    }
}
