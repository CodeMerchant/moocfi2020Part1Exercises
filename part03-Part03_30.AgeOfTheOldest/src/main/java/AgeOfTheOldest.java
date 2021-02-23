
import java.util.Scanner;

public class AgeOfTheOldest {

    /*
    Write a program that reads names and ages from the user
    until an empty line  is entered. The name and age are separated
    by a comma.
    
    After reading the input, the program prints the age of the oldest 
    person. You can assume that the user enters at least one person and
    that one of the users is older than the others.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] splitText = text.split(",");
            int age = Integer.valueOf(splitText[1]);

            if (age > current) {
                current = age;
            }
        }
        System.out.println("Age of the oldest: " + current);

    }
}
