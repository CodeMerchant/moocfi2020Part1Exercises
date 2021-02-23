/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Room {
    //creating instance variables
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats= numberOfSeats;
    }
}
