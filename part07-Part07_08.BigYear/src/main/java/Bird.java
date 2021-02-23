
import java.util.ArrayList;

public class Bird {

    private String name;
    private String latinName;
    private int observations;
    private ArrayList<String> birdsList;

    public Bird(String name, String latin) {
        this.latinName = latin;
        this.name = name;
        this.observations = 0;

        this.birdsList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservations() {
        return this.observations += 1;
    }

    public ArrayList<String> getList() {

        return this.birdsList;
    }

    @Override
    public String toString() {

        return getName() + "(" + getLatinName() + "):" + this.observations + " observations";
    }
}
