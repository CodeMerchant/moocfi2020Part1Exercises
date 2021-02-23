
package com.mycompany.algorithmsandbox;

/**
 * 
 * @author musa msomi
 */
public class Algorithms {
    public static void main(String[] args) {
        int [] array = {5,3,45,6,77,8,11,2};
        
        System.out.println(Algorithms.linearSearch(array, 0));
    }
    
    /**
     * Linear search method
     * An algorithm that searches for information in an array by going through every value in the array
     * one by one. When the value that was searched is found, its index is immediately returned. If not, linear sort
     * returns -1, which tells us that the searched value could not be found in  the array
     * @param array array that needs to be passed to the method
     * @param searched value that user wants to search for in the array
     * @return returns the index of the value that is being searched. -1 is returned if value is not found
     */
    public static int linearSearch(int[] array, int searched){
        for(int i =  0; i < array.length; i++){
            if(array[i] == searched){
                return i;
            }
        }
        return -1;
    }
    
    
    
}
