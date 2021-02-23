
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for?");
        int checkNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            int foundNum = list.get(i);
            if (checkNumber == foundNum) {

                System.out.println(foundNum + " is found at index " + i);
            }
        }

    }
}
