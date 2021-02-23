
import java.util.Scanner;

public class NameOfTheOldest {

    /*
    Write a program that reads names and ages from the user
    until an empty line  is entered. The name and age are separated
    by a comma.
    
    After reading the input, the program prints the name of the oldest 
    person. You can assume that the user enters at least one person and
    that one of the users is older than the others.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = 0;
        String oldest = "";

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }
            String[] splitText = text.split(",");
            int age = Integer.valueOf(splitText[1]);
            String names = splitText[0];

            if (age > current) {
                current = age;
                oldest = names;
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
