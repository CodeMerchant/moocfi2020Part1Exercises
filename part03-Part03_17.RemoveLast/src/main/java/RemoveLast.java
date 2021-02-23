
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> string = new ArrayList<>();
        string.add("First");
        string.add("Second");
        string.add("Third");
        
        System.out.println(string);
        
        removeLast(string);
        removeLast(string);
        
        System.out.println(string);
    }
    
    public static void removeLast(ArrayList<String> strings){
        if(strings.isEmpty()){
            
        } else{
            strings.remove(strings.size()-1);
        }
        
        
    }

}
