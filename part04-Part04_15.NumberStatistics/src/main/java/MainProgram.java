
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        
        
        

        /*stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average()); */
        //sum of user input
        System.out.println("Enter numbers:");
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            stats.addNumber(numbers);

            if (numbers % 2 == 0) {
                statsEven.addNumber(numbers);
            } else if (!(numbers % 2 == 0)) {
                statsOdd.addNumber(numbers);
            }

        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
