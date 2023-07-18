package zoo;

abstract public class Feline extends Mammalian{
    protected double clawSize;
    protected int speed;

    public Feline(String habitad, float height, float longs, String scientificName, double clawSize, int speed) {
        super(habitad, height, longs, scientificName);
        this.clawSize = clawSize;
        this.speed = speed;
    }

    public double getClawSize() {
        return clawSize;
    }

    public void setClawSize(double clawSize) {
        this.clawSize = clawSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
