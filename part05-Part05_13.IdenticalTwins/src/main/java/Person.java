
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    
    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        //if the variables are located in same position
        //they are equal
        if (this == compared) {
            return true;
        }

        //if the type of the compared object is not Person, the objects aren't equal
        if (!(compared instanceof Person)) {
            return false;
        }
        //convert Object type compared into a Person type object called comparedSimpleDate
        Person comparedPerson = (Person) compared;

        return this.name.equals(comparedPerson.name) && this.birthday.equals(comparedPerson.birthday) && this.height == comparedPerson.height && this.weight == comparedPerson.weight;
    }
}
