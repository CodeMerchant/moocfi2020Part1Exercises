
import java.util.Scanner;

public class LineByLine {

    /*
    Write a program thta reads strings from the user. If the 
    input is empty, the program stops reading input and halts.
    For each non-empty input it splits the string input by whitespaces and prints
    each part of the string line on a new line.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] splitText = text.split(" ");
            if (text.isEmpty()) {
                break;
            }
            for (String splitHolder: splitText) {

                System.out.println(splitHolder);
                break;

            }
        }

    }
}
