
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] strings = {"Black", "Lives", "Matter", "All", "Too"};
        ArrayList<Integer>intList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        intList.add(23);
        intList.add(8);
        intList.add(1);
        
        stringList.add("B");
        stringList.add("F");
        stringList.add("A");
        stringList.add("C");
        
        
        System.out.println("array before sorting");
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
        System.out.println("array after sorting");
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        System.out.println("");
        
        System.out.println("string array before sorting");
        System.out.println(Arrays.toString(strings));
        
        System.out.println("string array after sorting");
        Main.sort(strings);
        System.out.println(Arrays.toString(strings));
        
        System.out.println("");
        System.out.println("Unsorted IntList");
        System.out.println(intList);
        
        Main.sortIntegers(intList);
        System.out.println("Sorted intList");
        System.out.println(intList);
        
        System.out.println("");
        
        System.out.println("String list before sorting");
        System.out.println(stringList);
        
        Main.sortStrings(stringList);
        System.out.println("Sorted String list");
        System.out.println(stringList);
        
        
    }
    
    public static void sort(int[]array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer>integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String>strings){
        Collections.sort(strings);
    }

}
