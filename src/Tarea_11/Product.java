package Tarea_11;

public class Product {
    private String maker;
    private String nameProduct;
    private double price;

    public Product(String maker, String nameProduct, double price) {
        this.maker = maker;
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public String getMaker() {
        return maker;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public double getPrice() {
        return price;
    }


}
