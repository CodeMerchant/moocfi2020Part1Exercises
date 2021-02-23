package com.mycompany.unittestingsandbox;



/**
 * Tests are methods of the test class where each test "tests" an individual
 * unit.
 * @author musa
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
    
    
    //testing if initial value really IS zero
    @Test
    public void calculatorInitialValueZero(){
       Calculator calculator = new Calculator();
       assertEquals(0, calculator.getValue());
    }
    
    /*
    *Testing that the method getValue() returns 5 when we add 5 using add() method
    */
    @Test
    public void valueFiveWhenFiveAdded(){
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(5, calculator.getValue());
    }
    
    /*
    *Testing that the initial value "0", returns -2 when we pass 2 to the subtract
    *method. This test serves to check whether or not the subtract method works as 
    *it should. 
    */
    @Test
    public void valueMinusTwoWhenTwoSubtracted(){
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        assertEquals(-2, calculator.getValue());
    }
}
