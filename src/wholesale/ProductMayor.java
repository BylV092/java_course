package wholesale;

public class ProductMayor {
    private String nameProduct;
    private double price;
    private int quantity;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductMayor(String nameProduct, double price, int quantity) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }
}
