package wholesale;

import java.util.Date;

public class NotPerecibles extends ProductMayor {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public NotPerecibles(String nameProduct, double price, int quantity, int calories) {
        super(nameProduct, price, quantity);
        this.calories = calories;
    }
}
