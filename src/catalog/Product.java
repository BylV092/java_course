package catalog;

abstract class Product implements iProduct{
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
