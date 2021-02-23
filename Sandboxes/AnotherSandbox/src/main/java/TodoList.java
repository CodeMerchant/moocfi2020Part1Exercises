
import java.util.ArrayList;

import java.util.ArrayList;
public class TodoList {
       private ArrayList<String> todo;
    
    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task){
        this.todo.add(task);
    }
    
    public void print(){
        
        for(int i = 1; i < this.todo.size(); i++){
            System.out.println(this.todo.size() + ": "+ this.todo.get(i));
        }
    }
    
    public void remove(int number){
        this.todo.remove(number);
    }
}
