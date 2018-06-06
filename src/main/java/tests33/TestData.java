package tests33;

public class TestData {
    private final int v1;
    private final int v2;
    private final int r;

    public TestData(int v1, int v2, int r) {
        this.v1 = v1;
        this.v2 = v2;
        this.r = r;
    }

    public int val1() {
        return this.v1;
    }

    public int val2() {
        return this.v2;
    }

    public int result() {
        return this.r;
    }

    @Override
    public String toString() {
        return String.format("value1:%d, value2:%d, result:%d",this.v1, this.v2, this.r);
    }
}
