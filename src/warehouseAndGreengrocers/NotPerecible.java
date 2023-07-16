package warehouseAndGreengrocers;

public class NotPerecible extends Product {
    private int content;
    private int calories;

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public NotPerecible(String nameProduct, double price, int content, int calories) {
        super(nameProduct, price);
        this.content = content;
        this.calories = calories;
    }
}
