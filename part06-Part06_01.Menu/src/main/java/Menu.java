
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
   
    //adding meal to menu, if meal is already on the list, do not add it
    public void addMeal(String meal){
       if(!(this.meals.contains(meal))){
          this.meals.add(meal); 
       }
        
    }
    
    public void printMeals(){
        for(String printAll : this.meals){
            System.out.println(printAll);
        }
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
