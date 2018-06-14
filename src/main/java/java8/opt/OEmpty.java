package java8.opt;

public class OEmpty implements Optional2{
    @Override
    public boolean has() {
        return false;
    }

    @Override
    public Object get() {
        return null;
    }
}
