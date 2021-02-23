
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> items = new ArrayList<>();
        Archive item;
        /*String identify = "";
          String name = ""; */
        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String identify = scanner.nextLine();

            if (identify.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            item = new Archive(identify, name);
            if (!(items.contains(item))) {
                items.add(item);
            }

        }

        System.out.println("");
        System.out.println("==Items==");

        for (Archive printItems : items) {
            System.out.println(printItems);
        }
    }
}
