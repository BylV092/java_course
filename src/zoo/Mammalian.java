package zoo;

abstract public class Mammalian {
    protected String habitad;
    protected float height;
    protected float longs;
    protected String scientificName;

    public Mammalian(String habitad, float height, float longs, String scientificName) {
        this.habitad = habitad;
        this.height = height;
        this.longs = longs;
        this.scientificName = scientificName;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLongs() {
        return longs;
    }

    public void setLongs(float longs) {
        this.longs = longs;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    abstract public String eat();
    abstract public String sleep();
    abstract public String run();
    abstract public String Communicate();
}
