package steak;

public class Steak {
    private final String type;

    private int priceImplementation() {
        switch (this.type) {
            case "Well Done" : return 10;
            case "Medium" : return 7;
            case "Rare" : return 5;
            default: return 100;
        }
    }

    public Steak(String type) {
        this.type = type;
    }

    public String name() {
        return "My name:"+this.type;
    }

    public void prepare() {
        System.out.printf("please wait, %s is preparing...price will be:%d\n", name(), priceImplementation());
    }

    public int price() {
        return priceImplementation();
    }

    public int size() {
        return price()*2;
    }
}
