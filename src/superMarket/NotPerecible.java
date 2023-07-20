package superMarket;

public class NotPerecible extends Product{
    private int durationMonths;
    private boolean needRefrigeration;

    public NotPerecible(String nameProduct, double price, int durationMonths, boolean needRefrigeration) {
        super(nameProduct, price);
        this.durationMonths = durationMonths;
        this.needRefrigeration = needRefrigeration;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public boolean isNeedRefrigeration() {
        return needRefrigeration;
    }
}
