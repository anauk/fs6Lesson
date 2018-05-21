package oop;

public class Tesla implements Driveable, Smart{
    @Override
    public void drive() {
        System.out.println("I'm TESLA !!!");
    }

    @Override
    public void think() {
        System.out.println("I'm thinking...");
    }
}
