package exceptions;

public class Div {
    private final int one;
    private final int two;

    public Div(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int get() {
        return this.one/this.two;
    };
}
