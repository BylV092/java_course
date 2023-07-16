package wholesale;

public class Cleanings extends ProductMayor {
    private String components;
    private int litres;

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public Cleanings(String nameProduct, double price, int quantity, String components, int litres) {
        super(nameProduct, price, quantity);
        this.components = components;
        this.litres = litres;
    }
}
