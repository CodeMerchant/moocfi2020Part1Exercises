
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString(){
        String print = "The collection " + this.name;
        //forming a string from all the elements in the list
        String stringElements = "";
        
        if(this.elements.isEmpty()){
            return print + " is empty.";
        } else if(this.elements.size()==1){
            return print + " has " + this.elements.size() + " element:" + "\n" + this.elements.get(0);
        } else{
            for(String element : elements){
                stringElements = stringElements + element + "\n";
            }
            return print + " has " + this.elements.size() + " elements:" + "\n"+ stringElements;
        }
    }
}
