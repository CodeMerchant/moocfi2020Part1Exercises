
import java.util.Scanner;

public class AVClub {

    /*
    write a program that reads suer input until an empty line. For
    each non-empty string, the program splits the string by spaces
    and then prints the pieces that contain "av" each on a new line
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            String text = scanner.nextLine();

            String[] textSplitter = text.split(" ");
            if (text.isEmpty()) {
                break;
            }

            for (int i = 0; i < textSplitter.length; i++) {

                if (textSplitter[i].contains("av")) {
                    System.out.println(textSplitter[i]);
                }
            }

        }
    }
}
