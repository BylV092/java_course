package exampleBill.model;

public class itemBill {
    private int amount;
    private product Products    ;

    public itemBill(int amount, product product) {
        this.amount = amount;
        this.Products = product;
    }

    public product getProducts() {
        return Products;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float calculateImport() {
        return this.amount* this.Products.getPrice();
    }

    @Override
    public String toString() {
        return Products +
                "\t" + amount +
                "\t" + calculateImport();
    }
}
