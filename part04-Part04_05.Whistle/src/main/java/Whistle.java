/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Whistle {
    //creating instance variables
    private String sound;
    
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    
    public void sound(){
        System.out.println(this.sound);
    }
}
