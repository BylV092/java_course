package zoo;

abstract public class Canine extends Mammalian{
    protected String color;
    protected double tuskSize;

    public Canine(String habitad, float height, float longs, String scientificName, String color, double tuskSize) {
        super(habitad, height, longs, scientificName);
        this.color = color;
        this.tuskSize = tuskSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTuskSize() {
        return tuskSize;
    }

    public void setTuskSize(double tuskSize) {
        this.tuskSize = tuskSize;
    }
}
