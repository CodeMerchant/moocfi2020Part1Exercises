/*
Create a class Statistics that has the following functionality.
* a method addNumber(int num) that adds a new number to the staticstics
* a method getCount() tells the number of added numbers

The class does not need to store the added numbers anywhere, it 
is enough for it to remember their count. 

part2: Sum and average
expand the class with the following functionality
* the sum method tells the sum of numbers added(sum of an empty
number statistics object is 0)
* the average method tells the average of the numbers added
 */
public class Statistics {

    private int count;
    //expanded
    private int sum;

    //constructor
    public Statistics() {
        this.count = 0;
        this.sum = 0;

    }

    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum += number;

    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {

        if (this.count == 0) {
            return 0.0;
        } else {
            return (double) this.sum / this.count;
        }
    }
}
