/*
    Create the class Guage. The gauge has the instance variable private int value, a constructor
    without parameters, and also four methods which are:

*   public void increase() which grows the value variable by one. It doesn't allow the value to
    grow beyond the value 5.
*   public void decrease() which decreases the value variable's value by one. It doesn't
    allow the value to decrease beyond zero(i.e a negative number)
*   public int value() which returns the value variables value
*   public boolean full() which returns true if the instance variable has the value five.
    Otherwise, it returns false.
 */

/**
 *
 * @author musa
 */
public class Gauge {

    //instance variable
    private int value;

    //non parametrised constructor. 
    public Gauge() {
        this.value = 0;
    }

    //method creation
    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}
