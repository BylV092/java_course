package warehouseAndGreengrocers;
import warehouseAndGreengrocers.Product.*;
public class Fruit extends Product{
    private double weight;
    private String color;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(String nameProduct, double price, double weight, String color) {
        super(nameProduct, price);
        this.weight = weight;
        this.color = color;
    }
}
