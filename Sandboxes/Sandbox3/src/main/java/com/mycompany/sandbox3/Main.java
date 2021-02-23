/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandbox3;

/**
 *
 * @author musa
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        
        Bird red = new Bird("Red");
        
        System.out.println("Checking before adding to array list");
        if(birds.contains(red)){
            System.out.println("Red is on the list");
        } else {
            System.out.println("Red is not on the list");
        }
        
        birds.add(red);
        System.out.println("Checking after adding to arraylist");
        if(birds.contains(red)){
            System.out.println("Red is on the list");
        } else{
            System.out.println("Red is not on the list");
        }
        
        System.out.println("However");
        
        red = new Bird("Red");
        if(birds.contains(red)){
            System.out.println("Red is on the list");
        } else{
            System.out.println("Red is not on the list");
        }
        
    }
}
