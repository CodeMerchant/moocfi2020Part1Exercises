
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Bird bird;
    private Scanner scan;
    private ArrayList<Bird> birdsList;

    public UserInterface(ArrayList<Bird> birds, Scanner scan) {
        this.birdsList = birds;
        this.scan = scan;

    }

    public void start() {

        while (true) {
            System.out.print("?");
            String command = this.scan.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {

        if (command.equalsIgnoreCase("Add")) {
            addBird();
        }
        if (command.equalsIgnoreCase("observation")) {
            observe();
        }
        if (command.equalsIgnoreCase("All")) {
            printBirds();
        }
        if (command.equalsIgnoreCase("one")) {
            searchAndPrintOne();
        }
    }

    public void addBird() {

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin:");
        String latinName = scan.nextLine();

        this.birdsList.add(new Bird(name, latinName));

    }

    public void printBirds() {
        for (Bird bird1 : this.birdsList) {
            System.out.println(bird1.toString());
        }
        // System.out.println(this.bird.toString());
    }

    public void observe() {
        System.out.print("Bird? ");
        String birdName = scan.nextLine();

        boolean isFind = false;

        for (Bird bird1 : this.birdsList) {
            if (bird1.getName().contains(birdName)) {
                bird1.getObservations();
                isFind = true;
            }
        }

        if (!isFind) {
            System.out.println("Not a bird!");
        }
    }

    public void searchAndPrintOne() {
        System.out.print("Bird? ");
        String bird = scan.nextLine();

        for (Bird bird1 : this.birdsList) {
            if (bird1.getName().contains(bird)) {
                System.out.println(bird1.toString());
            }
        }

    }
}
