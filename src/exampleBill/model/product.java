package exampleBill.model;

public class product {
    private int code_id;
    private String nameProduct;
    private float price;
    private static int lastCode;

    public product() {
        this.code_id = ++lastCode;
    }

    public int getCode_id() {
        return code_id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code_id +
                "\t"+nameProduct+
                "\t" + price;
    }
}
