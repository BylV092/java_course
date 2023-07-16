package warehouseAndGreengrocers;

public class Cleaning extends Product{
    private String components;
    private double litres;

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public Cleaning(String nameProduct, double price, String components, double litres) {
        super(nameProduct, price);
        this.components = components;
        this.litres = litres;
    }
}
