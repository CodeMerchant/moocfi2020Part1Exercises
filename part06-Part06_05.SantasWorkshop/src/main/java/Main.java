
public class Main {

    public static void main(String[] args) {

        Gift book =  new Gift("Harry Potter", 2);
        Gift car = new Gift("Picanto", 1000);
       // System.out.println("Gifts name: " + book.getName());
        //System.out.println("Gifts weight: " + book.getWeight());
        
        //System.out.println("Gift: " + book);
        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(car);
        
        System.out.println(gifts.totalWeight());

    }
}
