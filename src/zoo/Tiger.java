package zoo;

public class Tiger extends Feline {
    private String tigerSpecies;

    public Tiger(String habitad, float height, float longs, String scientificName, double clawSize, int speed, String tigerSpecies) {
        super(habitad, height, longs, scientificName, clawSize, speed);
        this.tigerSpecies = tigerSpecies;
    }

    public String getTigerSpecies() {
        return tigerSpecies;
    }

    @Override
    public String eat() {
        return "The tiger hunts of specie " + tigerSpecies + " feeds in its habitat " + habitad;
    }

    @Override
    public String sleep() {
        return "The " + scientificName + "sleep under the leftovers of a large tree.";
    }

    @Override
    public String run() {
        return "The Tiger reaches speeds of up to " + speed + " km/h.";
    }

    @Override
    public String Communicate() {
        return "The tiger roar for communicate";
    }
}
