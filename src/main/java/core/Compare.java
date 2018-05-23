package core;

public class Compare {
    boolean compare(int i, int j) {
        return i==j;
    }
    boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }
    boolean compare(String s, int i) {
        return Integer.parseInt(s) == i;
    }
    boolean compare(int i, String s) {
        return compare(s,i);
    }

    public static void main(String[] args) {
        Compare c = new Compare();
        c.compare(1,1);
    }
}
