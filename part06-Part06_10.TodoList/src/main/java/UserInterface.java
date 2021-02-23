
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private TodoList todo;

    /**
     * 
     * @param todo takes in a TodoList ArrayList object 
     * @param scan takes in a Scanner object
     */
    public UserInterface(TodoList todo, Scanner scan) {
        this.scan = scan;
        this.todo = todo;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            commandPrompt(command);
        }
    }
/**
 * helper method for start() method.
 * @param command used to check against Scanner object provided in start() method 
 */
    public void commandPrompt(String command) {
        if (command.equalsIgnoreCase("add")) {
            add();
        } else if (command.equalsIgnoreCase("remove")) {
            remove();
        } else if (command.equalsIgnoreCase("list")) {
            list();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String add = this.scan.nextLine();
        this.todo.add(add);
    }

    public void list() {
        this.todo.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scan.nextLine());
        this.todo.remove(number);
    }
}
