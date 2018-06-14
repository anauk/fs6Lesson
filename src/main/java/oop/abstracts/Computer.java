package oop.abstracts;

import oop.abstracts.interfaces.Identifable00;
import oop.abstracts.interfaces.Thinkable00;

public class Computer implements Identifable00, Thinkable00 {
    private final int id;

    public Computer(int id) {
        this.id = id;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public void think() {
        System.out.println("011100001");
    }
}
