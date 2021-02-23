
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCount = Integer.valueOf(scanner.next());

        for (int j = startCount; j <= 100; j++) {
            System.out.println(j);
        }
    }
}
