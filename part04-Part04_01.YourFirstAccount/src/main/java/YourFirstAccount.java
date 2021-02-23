
public class YourFirstAccount {

    /*
    Write a program that creates an account with a balance of 100.0,
    deposits 20.0 in it and finally prints the balance.
     */
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("Musa's account", 100.0);
        myAccount.deposit(20.0);

        System.out.println("Balance: " + myAccount);
    }
}
