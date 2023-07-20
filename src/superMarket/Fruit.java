package superMarket;

public class Fruit extends Product{
    private String type;
    private String origin;

    public Fruit(String nameProduct, double price, String type, String origin) {
        super(nameProduct, price);
        this.type = type;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }
}
