
public class YourFirstBankTransfer {

    /*
    Write a program that
    1.Creates an account named "Matthews Account" with a balance of 1000.0
    2.Creates account named "My Account: with a balance of 0.0
    3.Withdraws 100.0 from Matthews account
    4.Deposits 100.0 into myAccount
    5.Prints both accounts
     */
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdrawal(100.0);

        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
