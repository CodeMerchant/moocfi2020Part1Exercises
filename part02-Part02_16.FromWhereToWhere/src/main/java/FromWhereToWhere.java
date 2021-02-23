
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int stopCount = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int startCount = Integer.valueOf(scanner.nextLine());

        for (int j = startCount; j <= stopCount; j = j + 1) {
            System.out.println(j);
        }
    }
}
