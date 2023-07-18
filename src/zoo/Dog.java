package zoo;

public class Dog extends Canine {
    private int psiBiteForce;

    public Dog(String habitad, float height, float longs, String scientificName, String color, double tuskSize, int psiBiteForce) {
        super(habitad, height, longs, scientificName, color, tuskSize);
        this.psiBiteForce = psiBiteForce;
    }

    public int getPsiBiteForce() {
        return psiBiteForce;
    }

    @Override
    public String eat() {
        return "The African Wild Dog off color " + color + " feeds on its prey in the African savannas whit a bite of: "+psiBiteForce;
    }

    @Override
    public String sleep() {
        return "The African Wild Dog of size " + height + " it rests in its burrow at night.";
    }

    @Override
    public String run() {
        return "The African Wild Dog is a fast predator with tusk of: " + tuskSize;
    }

    @Override
    public String Communicate() {
        return "The African Wild Dog barks to communicate with other members of its pack.";
    }
}
