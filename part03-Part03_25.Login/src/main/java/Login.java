
import java.util.Scanner;

public class Login {

    /*
    Write a program that recognises the following users:
    username    password
    alex        sunshine
    emma        haskell
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "alex";
        String password1 = "sunshine";
        String name2 = "emma";
        String password2 = "haskell";

        System.out.print("Enter username: ");
        String getName = scanner.nextLine();

        System.out.print("Enter password: ");
        String getPassword = scanner.nextLine();

        while (true) {
            if (getName.equals(name1) && getPassword.equals(password1)) {
                System.out.println("You have successfully logged in!");
                break;
            } else if (getName.equals(name2) && getPassword.equals(password2)) {
                System.out.println("You have successfully logged in!");
                break;
            } else {
                System.out.println("Incorrect username or password!");
                break;
            }
        }
    }
}
