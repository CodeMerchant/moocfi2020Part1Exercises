
import java.util.Scanner;

public class PrintThrice {

    /* Create a progeam that reads a string from the user and then prints
    it three times
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");
        String getWord = scanner.nextLine();

        System.out.println(getWord + getWord + getWord);
    }
}
