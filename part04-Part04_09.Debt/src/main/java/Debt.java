/*
 Create the class Debt that has double typed instance variables of balance and interestRate.
The balance and the interest rate are passed to the constructor as parameters
public Debt(double initialBalance, double initialInterestRate).

In addition, create the methods public void printBalance() and
public void waitOneYear() for the class. The method printBalance prints the current 
balance, and the the waitOneYear method grows the debt amount.

The debt is increased by multiplying the balance by the interest rate.
 */
public class Debt {

    //creating instance variables
    private double balance;
    private double interestRate;

    //creating constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    //creating methods
    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }

}
