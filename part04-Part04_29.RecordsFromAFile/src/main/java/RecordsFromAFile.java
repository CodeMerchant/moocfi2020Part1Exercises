
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner read = new Scanner(Paths.get(fileName))) {

            while (read.hasNextLine()) {
                String row = read.nextLine();

                String[] splitText = row.split(",");
                String name = splitText[0];
                int age = Integer.valueOf(splitText[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }

            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
