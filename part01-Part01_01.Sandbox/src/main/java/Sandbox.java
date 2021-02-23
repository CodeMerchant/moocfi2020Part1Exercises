//import java.util.ArrayList;
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //printing ArrayList in descending order using for-loop
        /*ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        
        for(int i = numbers.size()-1; i >= 0; i--){
            System.out.println(numbers.get(i));
        }*/
       
        
        Person ada = new Person("Ada");
        Person musa = new Person("Musa");
        
        /* obsolete. We will use the correct way using our toString method
        
        ada.printPerson();
        musa.printPerson();
        
        */
        System.out.println(ada);
        System.out.println(musa);
        System.out.println("-----------updated--------------");
        
        //calling growOlder method to add a year to persons age
        ada.growOlder();
        musa.growOlder();
        
        //printing updated persons details
        /*
        now obsolete
        ada.printPerson();
        musa.printPerson();
        
        */
        //correct way of print using toString method
        System.out.println(ada);
        System.out.println(musa);
        
        //print persons age from return age method
        System.out.println("------------using return age method----------");
        System.out.println("Ada's age: " + ada.returnAge());
        System.out.println("Musa's age: " + musa.returnAge());
        
        //combining both ages
        int combinedAges = musa.returnAge() + ada.returnAge();
        System.out.println("----------after combining ages-----------");
        System.out.println("Musa's and Ada's combined ages is: " + combinedAges + " years");
        
        //checking if person is of legal age
        //incrementing Ada's age.
        int i = 0;
         while(i < 30){
             ada.growOlder();
             
             i = i +1;
         }
         
         //incrementing Musa age
         int b = 0;
         while(b < 16){
             musa.growOlder();
             b++;
         }
        
         System.out.println("");
         
         if(musa.isOfLegalAge()){
            /* 
             * Calling the printPerson method which prints name and age of person
             
             System.out.print("Of legal age: ");
             musa.printPerson();
             
             */
            
            //printing out just the name 
             System.out.println(musa.getName()+" is of legal age");
         } else{
             /*
             * Calling the printPerson method which prints name and age of person
             
             System.out.print("Underage: ");
             musa.printPerson();
             
             */
             
             //printing out just the name 
             System.out.println(musa.getName() + " is underage");
         }
        
         if(ada.isOfLegalAge()){
             /*
             * Calling the printPerson method which prints name and age of person
             
             System.out.print("Of legal age: ");
             ada.printPerson(); 
             
             */
             
             
             //printing out just the name 
             System.out.println(ada.getName() + " is of legal age");
         } else{
             /*
             * Calling the printPerson method which prints name and age of person
             
             System.out.print("Underage: ");
             ada.printPerson();
             
             */
             
             //printing out just the name 
             System.out.println(ada.getName()+" is underage");
         }
        System.out.println("");
         System.out.println("---------------BMI-----------------");
         
         ada.setHeight(150);
         ada.setWeight(53);
         
         musa.setHeight(165);
         musa.setWeight(70);
         
         System.out.println(ada.getName()+ "'s body mass index is " + ada.bodyMassIndex());
         System.out.println(musa.getName()+ "'s body mass index is " + musa.bodyMassIndex());
    }
}
