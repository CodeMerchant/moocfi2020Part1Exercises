
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myCounter = Integer.valueOf(scanner.nextLine());

        for (int j = 0; j <= myCounter; j = j + 1) {
            System.out.println(j);
        }
    }
}
