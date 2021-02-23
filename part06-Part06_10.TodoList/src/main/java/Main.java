
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
       /* list.add("read the course");
        list.add("watch em");
        list.add("code");
        
        list.print();
        list.remove(2);
        System.out.println("");
        list.print();

*/
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
