
package com.mycompany.unittestingsandbox;

/**
 * Calculator class to use for testing example
 * @author musa
 */
public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }
    
    public void add(int number){
        this.value +=number;
    }
    
    //Purposely setting subtract method to add
    //This will help understand testing better
    public void subtract(int number){
        //Test returned a failure as expected.
        //this.value+=number;
        
        //fixing the method to output the correct functionality. Test should now pass
        this.value -=number;
    }
    
    public int getValue(){
        return this.value;
    }
}
