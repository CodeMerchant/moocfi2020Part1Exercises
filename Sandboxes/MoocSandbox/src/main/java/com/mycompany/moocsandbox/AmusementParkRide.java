/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moocsandbox;

/**
 *
 * @author musa
 */
import java.util.ArrayList;

public class AmusementParkRide {

    private String name;
    private int lowestLimit;
    private int visitors;
    //declaring list to help us keep track of all the people on the ride
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int lowestLimit) {
        this.name = name;
        this.lowestLimit = lowestLimit;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestLimit) {
            return false;
        }
        this.visitors = this.visitors + 1;
        //adding each person that meet the requirements to the riding list
        this.riding.add(person);
        return true;

    }

    public String getName() {
        return this.name;
    }

    public int getVisitor() {
        return this.visitors;
    }
    
    //adding a clear method to remove everyone on the ride list
    public void removeEveryoneOnRide(){
        this.riding.clear();
    }
    
    //calculating average height of people currently on the ride.
    public double averageHeightOfPeopleOnRide(){
        if(riding.isEmpty()){
            return -1;
        }
        
        int sumOfHeights = 0;
        
        for(Person per : riding){
            sumOfHeights += per.getHeight();
        }
        
        return (double) sumOfHeights / riding.size();
    }
    
    //method that returns tallest person on the ride. ie: retrieving specific object from list
    public Person getTallest(){
        //returning null reference if theres nobody on the ride
        if(this.riding.isEmpty()){
            return null;
        }
        
        //creating object reference for the object to be returned
        // Its first value is the first object on the list
        Person returnObject = this.riding.get(0);
        
        //going through the list
        for(Person pers:this.riding){
            //compare each obj on the list to the returnObject. We'll compare
            //heights since we want the tallest
            
            if(returnObject.getHeight() < pers.getHeight()){
                //if we find a taller person during comparison, we will
                //assign it as the value of the returnObject
                returnObject = pers;
            }
            
            
        }
        
            //return the object
            return returnObject;
    }

    @Override
    public String toString() {
        String printOutput = this.name + ", minimum height: "
                + this.lowestLimit + ". Total Visitors: "
                + this.visitors + "\n";
        
        //checking if riders list is empty and returning a message
        //informing us that nobody is on the ride
        if(riding.isEmpty()){
            return printOutput + "no one is on the ride";
        }

        //making sure that the string returned by the toString method contains
        //the name of each and every person on the ride
        //first form a string from all the people on the list
        String peopleOnTheRide = "";
        
        for (Person person : riding) {
            peopleOnTheRide = peopleOnTheRide + person.getName() + "\n";
        }

        //finally returning a string describing the object
        //including the names of those on the ride
        return printOutput + "\n" + "on the ride:\n" + peopleOnTheRide;
    }
}
