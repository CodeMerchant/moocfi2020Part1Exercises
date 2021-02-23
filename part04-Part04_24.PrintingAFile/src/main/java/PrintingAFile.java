
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            //reading the file until all lines have been read
            while (scanner.hasNextLine()) {
                //reading one line
                String row = scanner.nextLine();
                //printing out each  line that we are reading
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
