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
public class Bird {
    private String name;
    
    public Bird(String name){
        this.name = name;
    }
    
    //comparing using equals method
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Bird)){
            return false;
        }
        
        Bird comparedBird = (Bird) compared;
        
        return this.name.equals(comparedBird.name);
    }
}
