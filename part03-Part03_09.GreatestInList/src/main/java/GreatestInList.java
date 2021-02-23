
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        int greatest = list.get(0); 
        //1. int greatest will be initialised with number at index 0
        //2. int number will iterate every time i increments. Eg. number will be value stored at i= 0, 
        //   lets say at i=0, the number is 3.
        //3. We check if number at index i is > the number at int greatest, at this stage, the number
        //   at greatest is also 3 since we said greatest = list.get(0).
        //4. int greatest becomes the new number and the program moves back into the for loop where
        //   i = 1. int number is now initialised with the number at index 1. Lets say the number is 5.
        //5. We now check if the current value at int number is greater than the value occupying int greatest.
        //6. If int number IS > current value at int greatest, the value at int number is assigned to int greatest.
        //   int greatest now has the value "5" in it. The loop keeps going until we reach the end of the list.
        
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number > greatest) { 
                greatest = number;     
            }
        }
        System.out.println("Greatest " + greatest);
    }
}
