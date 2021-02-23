
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard card = new PaymentCard(10);
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        
       
        
        paul.eatHeartily();
        matt.eatAffordably();
        
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);
        
        paul.addMoney(20);
        
        matt.eatHeartily();
        
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);
        
        paul.eatAffordably();
        paul.eatAffordably();
        
        matt.addMoney(50);
        
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " + matt);
        
        
        //System.out.println(card);

        //card.eatHeartily();
        //System.out.println(card);
        
        //card.eatHeartily();
        //System.out.println(card);
        


        //adding money into account
        //card.addMoney(15);
        //System.out.println(card);
        
        //card.addMoney(10);
        //System.out.println(card);
        

        //checking to see if balance defaults to 150 if balance exceeds 150 euro
        //card.addMoney(700);
        //System.out.println(card);
        

        /*attempting to add negative amount
        System.out.println("Paul:" + card);
        card.addMoney(-20);
        System.out.println("Paul:" + card);
        */
    }
}
