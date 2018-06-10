package datagenerator;

public class Adder {
    private final int val1;
    private final int val2;

    public Adder(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int get() {
        return val1+val2;
    }
}
