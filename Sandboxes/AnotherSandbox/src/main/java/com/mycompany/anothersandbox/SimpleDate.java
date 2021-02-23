/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothersandbox;

/**
 *
 * @author musa
 */
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    //check if this date object ('this') is before 
    //the date object given as the parameter ('compared')
    public boolean before(SimpleDate compared) {
        //comparing years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        //comparing months if years are the same
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        //comparing days if year and month are the same
        return this.day < compared.day;
    }
    
    //create boolean equals method to check if current object is equal to or not equal to 
    //the object passed as an argument
    public boolean equals(Object compared){
        
    //if the variables are located in same position
    //they are equal
        if(this == compared){
            return true;
        }
        
        //if the type of the compared object is not SimpleDate, the objects aren't equal
        
        if(!(compared instanceof SimpleDate)){
            return false;
        }
        
        //convert Object type compared into a SimpleDate type object called comparedSimpleDate
        SimpleDate comparedSimpleDate = (SimpleDate) compared;
        
        //if values of the object variables are the same,
        //the objects are equal
        
      return this.day == comparedSimpleDate.day && this.month == comparedSimpleDate.month && this.year == comparedSimpleDate.year;
        
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
