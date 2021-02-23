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
public class MoocSandbox {

    public static void main(String[] args) {
       /* Person joan = new Person("Joan Ball");
        System.out.println(joan);

        Person ball = joan;
        ball.growOlder();
        ball.growOlder();

        System.out.println(joan);

        Person musa = ball;
        
        musa.growOlder();
        System.out.println(ball);
        
        musa = new Person("Musa Msomi");
        
        System.out.println(musa);
        ball = null;
        
        System.out.println(ball); */
        
       Person musa = new Person("Musa");
       musa.setHeight(164);
       
       Person amanda = new Person("Amanda");
       amanda.setHeight(160);
       
       Person nosipho = new Person("Nosipho");
       nosipho.setHeight(130);
       
       AmusementParkRide hellTunnel = new AmusementParkRide("Hell Tunnel", 155);
       
       if(hellTunnel.allowedToRide(musa)){
           System.out.println(musa.getName() + " is allowed to ride " + hellTunnel.getName() + ". You are visitor number: #" + hellTunnel.getVisitor());
       } else {
           System.out.println(musa.getName() + " is not allowed to ride " + hellTunnel.getName());
       }
       
       if(hellTunnel.allowedToRide(amanda)){
           System.out.println(amanda.getName() + " is allowed to ride " + hellTunnel.getName() + ". You are visitor number: #" + hellTunnel.getVisitor());
       } else{
           System.out.println(amanda.getName() + " is not allowed to ride " + hellTunnel.getName());
       }
       
       if(hellTunnel.allowedToRide(nosipho)){
           System.out.println(nosipho.getName() + " is allowed to ride " + hellTunnel.getName() + ". You are visitor number: #" + hellTunnel.getVisitor());
       } else {
           System.out.println(nosipho.getName() + " is not allowed to ride " + hellTunnel.getName());
       }
       
       
        System.out.println(hellTunnel);
        System.out.println("Average height: " + hellTunnel.averageHeightOfPeopleOnRide());
        
        System.out.println();
        System.out.println(hellTunnel.getTallest().getName());
        Person tallest = hellTunnel.getTallest();
        System.out.println(tallest.getName());
        
        //removing 
        hellTunnel.removeEveryoneOnRide();
        System.out.println();
        System.out.println(hellTunnel);
        
    }
}
