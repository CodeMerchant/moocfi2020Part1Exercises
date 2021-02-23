
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int getNum = Integer.valueOf(scanner.nextLine());
            if (getNum == -1) {
                break;
            }
            numList.add(getNum);
        }

        int sum = 0;
        int divisor = numList.size();
        for (int numbers : numList) {
            sum += numbers;
        }
        System.out.println("Average: " + (double) sum / divisor);
    }
}
