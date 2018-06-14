package oop.patterns.facade;

import oop.patterns.factory.Workable;

public class Behavior {
    private final Workable w;

    public Behavior(Workable built) {
        w=built;
    }

    public void startAndRun() {
        w.work();
    }
}
