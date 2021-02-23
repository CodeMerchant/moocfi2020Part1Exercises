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
public class MainProgram {
    
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        Counter counter2 = new Counter(5);
        counter.increase();
        counter.increase();
        
        System.out.println(counter); //should print a value of 2
        
        Counter clone = counter.clone();
        
        System.out.println(counter); //should print 2
        System.out.println(clone); //should also print 2
        
        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();
        
        System.out.println(counter); //should print 6
        System.out.println(clone); //should still print 2
        
        clone.increase();
        
        System.out.println(counter); //should still be 6
        System.out.println(clone); //value should be now be 3
        
        counter2.increase();
        Counter clone2 = counter2.clone();
        
        clone2.increase();
        clone2.increase();
        
        System.out.println(counter2);
        System.out.println(clone2);
    }
}
