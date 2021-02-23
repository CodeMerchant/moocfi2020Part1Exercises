
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numList = new ArrayList<>();

        while (true) {
            String names = scanner.nextLine();
            if (names.equals("end")) {
                break;
            }

            numList.add(names);
        }
        System.out.println(numList.size());
    }
}
