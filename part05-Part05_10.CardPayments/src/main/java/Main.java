
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        /* PaymentCard musa = new PaymentCard(10);

        System.out.println("money " + musa.balance());

        boolean wasSuccessful = musa.takeMoney(8);

        System.out.println("successfully withdrew:" + wasSuccessful);
        System.out.println("money " + musa.balance());

        wasSuccessful = musa.takeMoney(5);
        System.out.println("successfully withdrew:" + wasSuccessful);
        System.out.println("money " + musa.balance()); */

        PaymentTerminal cafeteria = new PaymentTerminal();

        /*double change = cafeteria.eatAffordably(10);
        System.out.println("remaining change " + change);
         */

 /* change = cafeteria.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = cafeteria.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(cafeteria); */
        //---------------------------------------------------------------
        /* PaymentCard lisa = new PaymentCard(7);

        boolean wasSuccessful = cafeteria.eatHeartily(lisa);
        System.out.println("there was enough money: " + wasSuccessful);

        wasSuccessful = cafeteria.eatHeartily(lisa);
        System.out.println("there was enough money: " + wasSuccessful);

        wasSuccessful = cafeteria.eatAffordably(lisa);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(cafeteria);

         */
        System.out.println(cafeteria);
        PaymentCard amandasCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + amandasCard.balance() + " euros");

        boolean wasSuccessful = cafeteria.eatHeartily(amandasCard);

        System.out.println("there was enough money: " + wasSuccessful);

        cafeteria.addMoneyToCard(amandasCard, 100);

        wasSuccessful = cafeteria.eatHeartily(amandasCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + amandasCard.balance() + " euros");
        
        System.out.println(cafeteria);

    }

}
