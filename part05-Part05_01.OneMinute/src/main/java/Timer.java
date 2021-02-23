/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Timer {

    private ClockHand secOfHun;
    private ClockHand seconds;

    public Timer() {
        this.secOfHun = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.secOfHun.advance();

        if (this.secOfHun.value() == 0) {

            this.seconds.advance();

        }

        /*if(this.seconds.value() == 0){
            
        }*/
    }

    @Override
    public String toString() {
        return this.seconds + ":" + this.secOfHun;
    }
}
