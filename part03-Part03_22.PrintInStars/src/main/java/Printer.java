
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here 
        //opening up main for-loop
        for (int i = 0; i < array.length; i++) {

            //adding a nested for-loop to change the numbers in array to stars
            for (int getStars = 0; getStars < array[i]; getStars++) {
                System.out.print("*");
            }
            //printing a new line after every line of star(s) is printed
            System.out.println("");
        }
    }

}
