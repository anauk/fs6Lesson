package oop.abstracts;

import oop.abstracts.interfaces.Nameable00;

public class Animal00 implements Nameable00 {
    private final String nam;

    public Animal00(String name) {
        this.nam = name;
    }

    @Override
    public String name() {
        return this.nam;
    }
}

