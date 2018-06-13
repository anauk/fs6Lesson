package io;

public class Computer implements Identifable00, Thinkable00{
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
