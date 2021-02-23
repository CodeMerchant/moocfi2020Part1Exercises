/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Archive {
    private String identifier, name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared){
        Archive items = (Archive) compared;
        return this.identifier.equals(items.identifier);
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
