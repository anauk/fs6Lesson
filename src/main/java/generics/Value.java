package generics;

public class Value<T> {
    private T val;

    public Value(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
