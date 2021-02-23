
import java.util.Scanner;

public class FirstWords {

    /*
    Write a program that reads user input until an empty line is entered.
    For each non empty line the program splits the string
    by spaces and prints the first part of the string
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            String[] textSplitter = text.split(" ");

            if (text.isEmpty()) {
                break;
            }
            for (String textSplitter1 : textSplitter) {
                if (textSplitter1.equals(textSplitter[0])) {
                    System.out.println(textSplitter1);
                }
            }

        }

    }
}
