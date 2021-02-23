
import java.util.Scanner;

public class LastWords {

    /*
    print last word in split string
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] textSplitter = text.split(" ");

            if (text.isEmpty()) {
                break;
            }
            for (String splitterHolder : textSplitter) {
                String getLast = textSplitter[textSplitter.length - 1];
                
                if (splitterHolder.equals(getLast)) {
                    System.out.println(splitterHolder);
                    
                }
            }
        }

    }
}
