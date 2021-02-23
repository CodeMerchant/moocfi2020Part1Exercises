
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        
        Person tc = new Person();
        Person goat = new Person("Ronaldo");
        
        

        System.out.println(leo);
        System.out.println(tc);
        System.out.println(goat);
    }
}
