
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int getNumbers = Integer.valueOf(scanner.nextLine());
            if (getNumbers == 9999) {
                break;
            }
            numbers.add(getNumbers);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = numbers.get(0);

        int i = 0;
        while (i < numbers.size()) {
            int currentNum = numbers.get(i);
            i++;
            if (smallest > currentNum) {
                smallest = currentNum;
            }

        }
        System.out.println("Smallest number: " + smallest);
        //printing out index of smallest number
        for (int b = 0; b < numbers.size(); b++) {
            if (numbers.get(b) == smallest) {
                System.out.println("Found at index: " + b);
            }
        }
    }
}
