package superMarket;

public class Lacteo extends Product{
    private String milkType;
    private boolean organic;

    public Lacteo(String nameProduct, double price, String milkType, boolean organic) {
        super(nameProduct, price);
        this.milkType = milkType;
        this.organic = organic;
    }

    public String getMilkType() {
        return milkType;
    }

    public boolean isOrganic() {
        return organic;
    }
}
