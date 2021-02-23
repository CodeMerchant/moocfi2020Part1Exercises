
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = 0;

        for (Item itemWeight : items) {
            totalWeight += itemWeight.getWeight();
        }

        if ((this.maxWeight - totalWeight) >= item.getWeight()) {
            this.items.add(item);
        }
    }

    //printing all the items. Item object makes call to toString method (Part 4)
    public void printItems() {
        for (Item printAllItems : items) {
            System.out.println(printAllItems.toString());
        }
    }

    //finding total weight (Part 4) 
    public int totalWeight() {
        int totalWeight = 0;
        for (Item total : items) {
            totalWeight += total.getWeight();
        }

        return totalWeight;
    }

    //Finding heaviest item (Part 5)
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item returnObject = this.items.get(0);

        for (Item findHeaviest : this.items) {
            if (findHeaviest.getWeight() > returnObject.getWeight()) {
                returnObject = findHeaviest;
            }
        }
        return returnObject;
    }

    @Override
    public String toString() {
        int weightOfItems = 0;
        for (Item item : items) {
            weightOfItems += item.getWeight();
        }
        //Language Formatting(Part 3)
        if (this.items.isEmpty()) {
            return "no items (" + weightOfItems + " kg)";
        }
        
        if(this.items.size() == 1){
            return this.items.size() + " item (" + weightOfItems + " kg)";
        }

        return this.items.size() + " items (" + weightOfItems + " kg)";
    }

}
