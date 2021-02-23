import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                list.add(row);
            }
        }
        catch (Exception e){
            System.out.println("Reading the file" + file + " failed");
        }
       
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if(list.contains(searchedFor)){
            System.out.println("Found");
        } else{
            System.out.println("Not found.");
        }
    }
}
