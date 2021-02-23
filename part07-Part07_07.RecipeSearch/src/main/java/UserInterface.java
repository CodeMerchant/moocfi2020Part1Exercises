
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private ArrayList<Recipes> recipesList;

    public UserInterface(ArrayList<Recipes> recipe, Scanner scan) {
        this.recipesList = recipe;
        this.scan = scan;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = this.scan.nextLine();
        this.recipesList = recipesFromFile(file);
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program\n"
                + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = this.scan.nextLine();
            System.out.println("");

            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            processCommand(command, this.recipesList, this.scan);

        }
    }

    public void processCommand(String command, ArrayList<Recipes> recipe, Scanner scan) {
        if (command.equalsIgnoreCase("list")) {
            printRecipes(recipe);
            System.out.println("");
        }
        if (command.equalsIgnoreCase("find name")) {
            findPrintRecipeByName(recipe, scan);
            System.out.println("");
        }
        if (command.equalsIgnoreCase("find cooking time")) {
            findAndPrintByCookingTime(recipe, scan);
            System.out.println("");
        }

        if (command.equalsIgnoreCase("find ingredient")) {
            findAndPrintByIngredient(recipe, scan);
            System.out.println("");
        }
    }

    public ArrayList<Recipes> recipesFromFile(String file) {
        ArrayList<Recipes> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();

        String recipeName;
        int cookTime;

        try (Scanner getFile = new Scanner(Paths.get(file))) {
            while (getFile.hasNextLine()) {
                String line = getFile.nextLine();

                //adding all the readable lines to our arraylist
                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    //Once the line is empty, extract the first two lines

                    recipeName = recipeParts.get(0);
                    cookTime = Integer.valueOf(recipeParts.get(1));

                    //remove the remaining lines
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    //Add to the Recipe list using constructor
                    recipes.add(new Recipes(recipeName, cookTime, recipeParts));
                    recipeParts.clear();
                }

            }
            //while recipeParts list is not empty 
            if (!recipeParts.isEmpty()) {
                //get the first two lines
                recipeName = recipeParts.get(0);
                cookTime = Integer.valueOf(recipeParts.get(1));
                
                //remove the remaining lines
                recipeParts.remove(0);
                recipeParts.remove(0);
                
                
                recipes.add(new Recipes(recipeName, cookTime, recipeParts));
                recipeParts.clear();

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public void findAndPrintByIngredient(ArrayList<Recipes> recipe, Scanner scan) {
        System.out.print("Ingredient:");
        String ingredient = scan.nextLine();
        System.out.println("Recipes: ");
        for (Recipes recipes : recipe) {
            if (recipes.getIngredients().contains(ingredient)) {
                System.out.println(recipes.toString());
            }
        }
    }

    public void findAndPrintByCookingTime(ArrayList<Recipes> recipes, Scanner scan) {
        System.out.print("Max cook time: ");
        int maxCookTime = Integer.valueOf(scan.nextLine());
        for (Recipes recipe : recipes) {
            if (recipe.getCookTime() <= maxCookTime) {
                System.out.println(recipe.toString());
            }
        }

    }

    public void findPrintRecipeByName(ArrayList<Recipes> recipe, Scanner scan) {
        System.out.print("Searched word: ");
        String word = scan.nextLine();

        System.out.println("Recipes: ");

        for (Recipes getRecipe : recipe) {
            if (getRecipe.getName().contains(word)) {
                System.out.println(getRecipe.toString());
            }
        }
    }

    public void printRecipes(ArrayList<Recipes> recipe) {
        System.out.println("Recipes:");
        for (Recipes print : recipe) {
            System.out.println(print.toString());
        }
    }

}
