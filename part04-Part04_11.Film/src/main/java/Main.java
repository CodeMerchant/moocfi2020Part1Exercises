
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Film Scarface = new Film("Scarface", 18);

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");

        int age = Integer.valueOf(scan.nextLine());

        System.out.println("");
        if (age >= Scarface.ageRating()) {
            System.out.println("You may watch the film " + Scarface.name());
        } else {
            System.out.println("You may not watch the film " + Scarface.name());
        }

    }
}
