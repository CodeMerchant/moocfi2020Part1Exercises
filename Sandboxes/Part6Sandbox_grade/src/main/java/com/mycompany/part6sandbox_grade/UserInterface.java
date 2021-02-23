
package com.mycompany.part6sandbox_grade;
import java.util.Scanner;
/**
 *User Interface that reads points and prints the grade distribution
 * @author musa
 */
public class UserInterface {
    private GradeRegister register;
    private Scanner scan;
    
    /**
     * Constructor takes GradeRegister object and Scanner object as parameters
     * @param register object from class GradeRegister
     * @param scan object from Scanner class
     */
    public UserInterface(GradeRegister register, Scanner scan){
       this.register = register;
       this.scan = scan;
    }
    
    public void start(){
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }
    
    public void readPoints(){
       while(true){
          System.out.print("Points: ");
          //placing scanner obj into String variable for cleaner code
          String input = scan.nextLine();
          if(input.equals("")){
              break;
          }
         
          int points = Integer.valueOf(input);
          
          if(points < 0 || points > 100){
              System.out.println("Impossible number.");
              continue;
          }
          
          register.addGradeBasedOnPoints(points);
          
      }  
    }
    
    public void printGradeDistribution(){
          int grade = 5;
        while(grade >= 0){
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            
            //making call to printStars method, passing stars value
            printStars(stars);
            System.out.println("");
            
            grade = grade -1;
        }
    }
    public static void printStars(int stars){
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
    }
    
}
