/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxcloning;

/**
 *
 * @author musa
 */
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
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
    }
}
