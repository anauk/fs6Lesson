package java8.opt;

import java.util.function.Supplier;

public class HiddenGenerator implements Supplier<Integer>{
    @Override
    public Integer get() {
        return (int) (Math.random() * 100);
    }
}
