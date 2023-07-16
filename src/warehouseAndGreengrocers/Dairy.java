package warehouseAndGreengrocers;

public class Dairy extends Product{
    private int amount;
    private int proteins;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public Dairy(String nameProduct, double price, int amount, int proteins) {
        super(nameProduct, price);
        this.amount = amount;
        this.proteins = proteins;
    }
}
