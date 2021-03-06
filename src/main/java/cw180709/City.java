package cw180709;

public class City {
    private final int id;
    private final String name;

    public City(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("City{id=`%d`, name=`%s`}",id, name);
    }

    // thi is test
    public static void main(String[] args) {
        City city = new City(1, "New York");
        System.out.println(city);
    }
}
