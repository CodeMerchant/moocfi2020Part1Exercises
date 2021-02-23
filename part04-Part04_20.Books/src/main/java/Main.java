
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookCollection = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Title:");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages:");
            int pages = Integer.valueOf(scan.nextLine());

            System.out.print("Publication year:");
            int year = Integer.valueOf(scan.nextLine());

            bookCollection.add(new Book(title, pages, year));
        }
        System.out.println("");
        System.out.print("What information will be printed?");
        String whatInfo = scan.nextLine();

        for (Book bookHolder : bookCollection) {
            if (whatInfo.equals("everything")) {
                System.out.println(bookHolder.toString());
            } else if (whatInfo.equals("name")) {
                System.out.println(bookHolder.getName());
            }
        }

    }
}
