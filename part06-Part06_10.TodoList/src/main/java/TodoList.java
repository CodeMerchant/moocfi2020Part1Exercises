
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        this.todo.add(task);
    }

    public void print() {

        for (int i = 0; i < this.todo.size(); i++) {
            //(i+1) because we need to have element at index(0) have a 
            //starting number of 1. eg. 
            System.out.println((i + 1) + ": " + this.todo.get(i));
        }
    }

    public void remove(int number) {

        //assuming that the given number corresponds to a certain task
        //we have to take 1 away from the passed number. 
        this.todo.remove(number - 1);
    }
}
