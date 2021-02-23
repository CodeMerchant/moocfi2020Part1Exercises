/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    //1. making transactions
    //2. Amending code to stop reducing the balance once it becomes negative
    public void eatAffordably() {
        //1.  this.balance = this.balance - 2.60;
        //2

        double currentBalance = this.balance - 2.60;
        if (!(currentBalance < 0)) {
            this.balance = currentBalance;
        }
        /*
        alternate way of writing this code
       
        if (!(this.balance - 2.60 < 0)) {
            this.balance = this.balance - 2.60;
        }
         */
    }

    public void eatHeartily() {
        //1. this.balance = this.balance - 4.60;
        //2
        double currentBalance = this.balance - 4.60;
        if (!(currentBalance < 0)) {
            this.balance = currentBalance;
        }
    }

    /*
    Increase the card's balance by amount of money given as 
    parameter. However, the cards balance may not exceed 150 euros. As such,
    if the amount to be topped up exceeds this limit, the balance should, in
    any case, become exactly 150 euros. 
    
    If there is an attempt to top up card with negative amount, the value
    on the card should not change.
     */
    public void addMoney(double amount) {
        //double currentBal = this.balance + amount;
        //this.balance = currentBal;
        /* if (currentBal > 150) {
            this.balance = 150;
       
        } */

        if (!(amount < 0)) {
            double currentBal = this.balance + amount;
            this.balance = currentBal;
            if (currentBal > 150) {
                this.balance = 150;

            }
        }

    }

}
