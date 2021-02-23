
public class Person {
    private String name;//these are called instance varaibles or object attributes
    private int age;
    //new variables for BMI calculation
    private int height;
    private int weight;
    
    //constructor
    public Person(String initialName){
        this.age = 0;
        this.name = initialName;
        //initialising new variables for BMI
        this.height = 0;
        this.weight = 0;
    }
    
    /*    
    *Creating method. Now obsolete, we will make a toString method 
    *which will perform the exact same function of printPerson()
    
    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    } 
    
    */
    
    //toString  method creation. Calling in main function won't need a person.toString(),
    //instead, java will do it for us. All we have to do is call the objectName eg. sop(Musa);
    //prints Musa's name and age
    @Override
    public String toString(){
        return this.name + ", age " + this.age + " years";
    }
    
    //method containing the name of person object. This is known as "getter" method
    //"getter" methods always start with "get" in Java
    public String getName(){
        return this.name;
    }
    
    //adding age method that increments persons age by a year
    public void growOlder(){
        if(this.age < 30){
            this.age = this.age + 1;
        }
    }
    
    //creating method that returns age of person
    public int returnAge(){
        return this.age;
    }
    
    //method to check if person is of legal age using boolean
    public boolean isOfLegalAge(){
        return this.age >= 18; //this is saying return true if greater than or equal to 18
    }
    
    //We now want to calculate a persons BMI. We create two void methods for height and weight
    //These are called "setter" methods, since their only intention is to set a value
    //and they always take parameters that the instance
    //variables will be initialised to. **See constructor**
    
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    
    //creating method that calculates BMI. This will return a value since a 
    //calculation is being made
    
    public double bodyMassIndex(){
        double heightPerHundred = this.height/100.0;
        
        return this.weight/ (heightPerHundred);
    }
    
    
 
}
