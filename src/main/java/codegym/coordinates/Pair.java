package codegym.coordinates;

public class Pair {
    private final Character ch;
    private final Integer pos;

    public Pair(Character ch, Integer pos) {
        this.ch = ch;
        this.pos = pos;
    }

    public Character ch() {
        return this.ch;
    }

    public Integer pos() {
        return this.pos;
    }

    @Override
    public String toString() {
        return String.format("Letter: %s position: %d", ch, pos);
    }

    public void print() {
        System.out.println(this);
    }

}
