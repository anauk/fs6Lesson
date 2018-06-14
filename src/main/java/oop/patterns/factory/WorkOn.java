package oop.patterns.factory;

public class WorkOn {
    public void work(int value) {
        switch (value) {
            case 1 :
                Worker1 w1 = new Worker1();
                w1.work();
                break;
            case 2 :
                Worker2 w2 = new Worker2();
                w2.work();
                break;
            case 3 :
                Worker3 w3 = new Worker3();
                w3.work();
                break;
            default: throw new IllegalArgumentException("__unsupported value");
        }
    }
}
