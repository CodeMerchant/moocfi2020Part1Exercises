
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= lastNum; i = i + 1) {
            result = result + i;//result is equal to 0 + 1...and so on until we reach last num
        }
        System.out.println("The sum is " + result);
    }
}
