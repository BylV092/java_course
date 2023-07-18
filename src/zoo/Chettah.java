package zoo;

public class Chettah extends Feline{
    public Chettah(String habitad, float height, float longs, String scientificName, double clawSize, int speed) {
        super(habitad, height, longs, scientificName, clawSize, speed);
    }
    @Override
    public String eat() {
        return "The Cheetah runs at high speeds to hunt its prey.";
    }

    @Override
    public String sleep() {
        return "The Cheetah rests after a grueling race.";
    }

    @Override
    public String run() {
        return "The cheetah is know for its high speed reaching speeds of up to " + speed + " km/h.";
    }

    @Override
    public String Communicate() {
        return "The Cheetah emits high-pitched sounds to communicate with other cheetahs.";
    }
}
