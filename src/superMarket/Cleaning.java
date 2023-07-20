package superMarket;

public class Cleaning extends Product{
    private String category;
    private boolean toxic;

    public Cleaning(String nameProduct, double price, String category, boolean toxic) {
        super(nameProduct, price);
        this.category = category;
        this.toxic = toxic;
    }

    public String getCategory() {
        return category;
    }

    public boolean isToxic() {
        return toxic;
    }
}
