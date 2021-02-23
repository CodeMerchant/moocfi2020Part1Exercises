
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //code
        System.out.println("Value of gift?");
        double amount = Double.valueOf(scan.nextLine());

        if (amount >= 5000 && amount <= 25000) {
            System.out.println("Tax: " + (100 + (amount - 5000) * 0.08));
        } else if (amount >= 25000 && amount <= 55000) {
            System.out.println("Tax: " + (1700 + (amount - 25000) * 0.10));
        } else if (amount >= 55000 && amount <= 200000) {
            System.out.println("Tax: " + (4700 + (amount - 55000) * 0.12));
        } else if (amount >= 200000 && amount <= 1000000) {
            System.out.println("Tax: " + (22100 + (amount - 200000) * 0.15));

        } else if (amount > 1000000) {
            System.out.println("Tax:" + (142100 + (amount - 1000000) * 0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}
