
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name:");
            String nameOfProg = scanner.nextLine();

            if (nameOfProg.isEmpty()) {
                break;
            }
            System.out.print("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(nameOfProg, duration));

        }
        System.out.print("Programs maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram listHolder : programs) {
            if (listHolder.getDuration() <= maxDuration) {
                System.out.println(listHolder.toString());
            }
        }

    }
}
