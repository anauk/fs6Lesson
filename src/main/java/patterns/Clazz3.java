package patterns;

public class Clazz3 implements Driveable {
    private final Class3 element;

    public Clazz3() {
        element = new Class3();
    }

    @Override
    public void print() {
        element.print_z("Hell");
    }

    @Override
    public int maxSpeed() {
        return element.max();
    }
}
