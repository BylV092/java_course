package zoo;

public class Lion extends Feline{
    private int herdNumber;
    private double roarPower;

    public Lion(String habitad, float height, float longs, String scientificName, double clawSize, int speed, int herdNumber, double roarPower) {
        super(habitad, height, longs, scientificName, clawSize, speed);
        this.herdNumber = herdNumber;
        this.roarPower = roarPower;
    }

    public int getHerdNumber() {
        return herdNumber;
    }

    public double getRoarPower() {
        return roarPower;
    }
    @Override
    public String eat() {
        return "The lion hunts with his group of " + herdNumber + " individuals in the African plains.";
    }

    @Override
    public String sleep() {
        return "The lion sleeps in its habitat of " + habitad + ".";
    }

    @Override
    public String run() {
        return "The lion runs at an impressive speed of " + speed + " km/h.";
    }

    @Override
    public String Communicate() {
        return "The lion roars with a power of \n" + roarPower + " decibels.";
    }
}
