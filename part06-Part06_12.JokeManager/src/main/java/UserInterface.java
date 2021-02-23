/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scan;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke\n2 - draw a joke\n3- list jokes\nX - stop");
            String command = scan.nextLine();
            if (command.equalsIgnoreCase("x")) {
                break;
            }

            promptCommand(command);
        }

    }

    public void promptCommand(String command) {

        if (command.equalsIgnoreCase("1")) {
            addToJokesList();
        } else if (command.equalsIgnoreCase("2")) {
            randomJoke();
        } else if (command.equalsIgnoreCase("3")) {
            printJokes();
        }

    }

    public void addToJokesList() {
        System.out.println("Write the joke that needs to be added:");
        String addJoke = scan.nextLine();
        this.jokes.addJoke(addJoke);
    }

    public void randomJoke() {
        System.out.println("Drawing a joke");
        System.out.println(this.jokes.drawJoke());
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");
            this.jokes.printJokes();
    }
}
