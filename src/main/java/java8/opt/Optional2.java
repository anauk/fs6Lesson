package java8.opt;

public interface Optional2<T> {
    boolean has();
    T get();

    class Value implements Optional2<Integer> {
        private final Integer value;

        public Value(Integer value) {
            this.value = value;
        }

        @Override
        public boolean has() {
            return true;
        }

        @Override
        public Integer get() {
            return value;
        }
    }
    class Empty implements Optional2 {

        @Override
        public boolean has() {
            return false;
        }

        @Override
        public Object get() {
            throw new IllegalArgumentException("");
        }
    }
}
