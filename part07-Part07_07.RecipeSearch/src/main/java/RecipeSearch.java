
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipes> recipes = new ArrayList<>();

        UserInterface ui = new UserInterface(recipes, scanner);
        ui.start();

    }

}
