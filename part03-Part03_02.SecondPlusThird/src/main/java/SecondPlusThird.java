
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int getNumber = Integer.valueOf(scanner.nextLine());
            if (getNumber == 0) {
                break;
            }
            
            numbers.add(getNumber);
        }

        System.out.println(numbers.get(1)+numbers.get(2));
    }
}
