/*
 Create a class named Multiplier that has:
 * constructor public Multiplier(int number)
 * method public int multiply(int number) which returns the value
   number passed to it multiplied by the number provided to the constructor
    
 */

/**
 *
 * @author musa
 */
public class Multiplier {

    private int number;

    //constructor
    public Multiplier(int number) {
        this.number = number;
    }

    //method
    public int multiply(int number) {
        return number * this.number;
    }
}
