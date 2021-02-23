/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandbox4;

/**
 *
 * @author musa
 */
public class Counter {
    
    private int value;
    
    //using multiple constructors
    //we can call another constructor from a constructor by calling "this"
    //the "this" call must be on the first line of the constructor
    
    public Counter(){
        this(0);
    }
    
    public Counter(int initialValue){
        this.value = initialValue;
    }
    
    //method to increase our value
    public void increase(){
        this.value = this.value + 1;
    }
    
    @Override
    public String toString(){
        return "value: " + value;
    }
    
    //creating clone method
    @Override
    public Counter clone(){
        //creating new Counter object that receives the value of the cloned
        //counter as its initial value
        Counter clone = new Counter(this.value);
        
        //returning the clone to the caller
        return clone;
    }
}
