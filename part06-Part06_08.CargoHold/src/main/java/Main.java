
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("lords", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        
       
       // System.out.println("The book's name: " + book.getName());
       // System.out.println("The book's weight: " + book.getWeight());
        
       // System.out.println("Book: " + book);
       // System.out.println("Phone: " + phone);
        
        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);
        
        suitcase.addItem(book);
        System.out.println(suitcase);
        
        suitcase.addItem(phone);
        System.out.println(suitcase);
        
        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        System.out.println("");
        
        //All Items
        System.out.println("The suitcase contains the following items: ");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        //heaviest
        System.out.println("Heaviest item: " + suitcase.heaviestItem());
        
        //testing out hold class
        Suitcase myCase = new Suitcase(10);
        myCase.addItem(book);
        myCase.addItem(phone);
        
        Suitcase xCase = new Suitcase(10);
        xCase.addItem(brick);
        
        Hold hold = new Hold(1000);
        hold.addSuitcase(myCase);
        hold.addSuitcase(xCase);
        System.out.println("");
        System.out.println(hold);
        System.out.println("");
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
