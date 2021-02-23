
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    //adding specified luggage to the load
    public void addSuitcase(Suitcase suitcase) {
        int weightOfSuitcases = 0;

        for (Suitcase s : this.hold) {
            weightOfSuitcases += s.totalWeight();
        }
        //Ensuring that the totalWeight of the suitcases the list contains 
        //doesn't exceed the maximumWeight.

        if ((this.maximumWeight - weightOfSuitcases) >= suitcase.totalWeight()) {
            this.hold.add(suitcase);
        }

    }

    //The Hold class contents (Part 7)
    public void printItems() {
        for (Suitcase printAll : this.hold) {
            //No need to use s.o.p to print as the call to printItems method
            // from Suitcase class already implements
            //an SOP call
            printAll.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeightOfSuitcases = 0;

        for (Suitcase s : this.hold) {
            totalWeightOfSuitcases += s.totalWeight();
        }

        return this.hold.size() + " suitcases (" + totalWeightOfSuitcases + " kg)";
    }
}
