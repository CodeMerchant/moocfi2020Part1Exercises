
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int sec = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + sec + "/100");

        while (true) {

            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int liquidAmount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (liquidAmount > 0) {
                    first += liquidAmount;
                }

                if (first > 100) {
                    first = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + sec + "/100");
            }

            //moving liquid from first container to second container
            if (command.equals("move")) {
                if (liquidAmount > 0) {
                    //if program is requested to move more liquid than the first container
                    //currently has, move all the remainig liquid
                    if (liquidAmount > first) {
                        //logic
                        sec += first;
                        first = 0;
                    } else {
                        //moving the liquid from first container
                        first -= liquidAmount;
                        //adding moved liquid to second container
                        sec += liquidAmount;
                    }
                }

                if (sec > 100) {
                    sec = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + sec + "/100");
            }

            if (command.equals("remove")) {
                if (liquidAmount > 0) {
                    sec -= liquidAmount;
                }

                if (sec < 0) {
                    sec = 0;
                }

                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + sec + "/100");
            }

        }

    }

}
