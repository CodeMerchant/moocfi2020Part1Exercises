
import java.util.ArrayList;

public class Recipes {

    private String recipeName;
    private int cookTime;
    private ArrayList<String> recipeList = new ArrayList<>();

    public Recipes(String recipe, int cookingTime, ArrayList<String> recipes) {
        this.recipeName = recipe;
        this.cookTime = cookingTime;

        for (String recipeIngerdients : recipes) {
            this.recipeList.add(recipeIngerdients);
        }

    }

    //getName method
    public String getName() {
        return this.recipeName;
    }

    //getCookingTime method
    public int getCookTime() {
        return this.cookTime;
    }

    public ArrayList<String> getIngredients() {
        return this.recipeList;
    }

    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.getCookTime();
    }
}
