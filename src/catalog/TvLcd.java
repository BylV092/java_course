package catalog;


class TvLcd extends Electronic implements iProduct{
    private int price;
    private int inch;

    public TvLcd(String maker, int inch,int price) {
        super(maker);
        this.inch = inch;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override


    public double getSalePrice() {
        return getPrice() * 1.3;
    }

    public int getInch() {
        return inch;
    }
}
