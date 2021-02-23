
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 6, 9, 8, 12};

        // System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println("Index of smallest from index 0: " + MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println("Index of smallest from index 1: " + MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println("Index of smallest from index 2: " + MainProgram.indexOfSmallestFrom(array, 2));

        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));

        MainProgram.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));

    }

    public static int smallest(int[] array) {
        //initialise smallest with the first element in the array. Always do this
        int smallest = array[0];
        //open Foreach loop to iterate over array
        for (int currentValue : array) {
            //if smallest is greater than the first element in the array
            //smallest will be set to the small element. For example
            //array[0] contains 3. 3 is greater than 1 so smallest becomes 1.
            //We check if 1 is greater than the next numbers in the array
            //and we find that 1 is not greater than any one of them
            //so smallest remains 1. If zero was in the array, the program would
            //check if 1 is greater than 0 which would then set smallest to 0.
            if (smallest > currentValue) {
                smallest = currentValue;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        //initialising int variable with a call to smallest method which will return the smallest
        //value in the array thats been passed to indexOfSmallest(int[] array)
        int smallest = smallest(array);
        //initialising indexOfSmallest to zero
        int indexOfSmallest = 0;
        //finding the index of the smallest
        for (int i = 0; i < array.length; i++) {
            //if value at index i is equal to the smallest value, we point the indexOfSmallest to
            //the index where values matched
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = table[indexOfSmallest];

        for (int i = startIndex; i < table.length; i++) {
            //if value at index i is less than smallest value. Smallest value will be set
            //to the value at index [i] of the table array. We then set the indexOfSmallest
            //variable to the index of the smallest
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;

    }

    public static void swap(int[] array, int index1, int index2) {
        int currentValue = array[index1];
        array[index1] = array[index2];
        array[index2] = currentValue;
    }

    public static void sort(int[] array) {
        /* int index = 0;
        while(index < array.length){
            swap(array, index, indexOfSmallestFrom(array, index));
            index+=1;
        }
         */
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
