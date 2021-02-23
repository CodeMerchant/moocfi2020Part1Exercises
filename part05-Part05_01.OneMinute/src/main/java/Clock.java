/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    
    public Clock(){
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.seconds.advance();
        
        if(this.seconds.value()== 0){
            this.minutes.advance();
            this.seconds.advance();
        }
        
        if(this.minutes.value() == 0){
            this.hours.advance();
            this.minutes.advance();
        }
    }
    
    @Override
    public String toString(){
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
