
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum + secNum;
        System.out.println(firstNum + " + " + secNum + " = " + sum);

    }
}
