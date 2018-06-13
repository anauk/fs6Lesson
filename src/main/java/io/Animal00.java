package io;

public class Animal00 implements Nameable00 {
    private final String name;

    public Animal00(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return this.name;
    }
}
