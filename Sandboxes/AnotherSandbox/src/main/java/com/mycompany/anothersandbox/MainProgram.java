/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothersandbox;

import java.time.LocalDate;
public class MainProgram {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(17,8,2001);
        
        //Simple date objects for comparison
        SimpleDate uno = new SimpleDate(15,12,1991);
        SimpleDate dos = new SimpleDate(8,11,1990);
        SimpleDate dres = new SimpleDate(22,10,1993);
        
        
        SimpleDate cuatro = new SimpleDate(21,06,1999);
        SimpleDate cinco = new SimpleDate(21,06,1999);
        SimpleDate seis = new SimpleDate(23,9,1998);
        SimpleDate siete = seis;
        
        Person mason = new Person("Mason Greenwood", date);
        Person rashford = new Person("Marcus Rashford", 12, 06, 1997);
        
        System.out.println(mason);
        System.out.println(rashford);
        
        /*using built in date class to get date
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        
        System.out.println("today is " + day + "." + month + "." + year);
        */
        
       /* testing olderThan method
        
               if(mason.olderThan(rashford)){ //same as mason.olderThan(rashford)==true
            System.out.println(mason.getName() + " is older than " + rashford.getName());
        } else {
            System.out.println(mason.getName() + " is not older than " + rashford.getName());
        }
       */
       
       //testing before method from SimpleDate class
        System.out.println(uno + " is earlier than " + dos + ": " + uno.before(dos));
        System.out.println(dos + " is earlier than " + uno + ": " + dos.before(uno));
        
        System.out.println(dos + " is earlier than " + dres + ": " + dos.before(dres));
        System.out.println(dres + " is earlier than " + dos + ": " + dres.before(dos));
        
        //checking if reference variables are equal
      
        
    }
}
