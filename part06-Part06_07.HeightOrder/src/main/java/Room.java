
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personsList;

    public Room() {
        this.personsList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personsList.add(person);
    }

    public boolean isEmpty() {
        return this.personsList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personsList;
    }

    public Person shortest() {
        if (this.personsList.isEmpty()) {
            return null;
        }

        Person returnObject = this.personsList.get(0);

        for (Person findShortest : this.personsList) {
            if (returnObject.getHeight() > findShortest.getHeight()) {
                returnObject = findShortest;
            }
        }
        return returnObject;
    }

    public Person take() {
        if (this.personsList.isEmpty()) {
            return null;
        }

        Person returnObject = this.personsList.get(0);

        for (Person findShortest : this.personsList) {
            if (returnObject.getHeight() > findShortest.getHeight()) {
                returnObject = findShortest;
            }

        }
        this.personsList.remove(returnObject);
        return returnObject;

    }

}
