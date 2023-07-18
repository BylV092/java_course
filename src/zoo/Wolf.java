package zoo;

public class Wolf extends Canine{
    private int litterNumber;
    private String wolfSpice;

    public Wolf(String habitad, float height, float longs, String scientificName, String color, double tuskSize, int litterNumber, String wolfSpice) {
        super(habitad, height, longs, scientificName, color, tuskSize);
        this.litterNumber = litterNumber;
        this.wolfSpice = wolfSpice;
    }

    public int getLitterNumber() {
        return litterNumber;
    }

    public String getWolfSpice() {
        return wolfSpice;
    }
    @Override
    public String eat() {
        return "The wolf of the specie " + wolfSpice + " feeds in its habitat of " + habitad + ".";
    }

    @Override
    public String sleep() {
        return "The wolf of color " + color + " sleep in his lair in the middle of the forest.";
    }

    @Override
    public String run() {
        return "The Wolf runs at high speed with his pack, hunting as a team.";
    }

    @Override
    public String Communicate() {
        return "The Wolf howls to communicate with other wolves in his litter of: "+litterNumber;
    }



}
