package catalog;
import java.util.Date.*;

public class Iphone extends Electronic implements iProduct {
    private int price;
    private String color;
    private String model;

    public Iphone(String maker, String color, String model,int price) {
        super(maker);
        this.color = color;
        this.model = model;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getSalePrice() {
        return getPrice() * 1.2;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
