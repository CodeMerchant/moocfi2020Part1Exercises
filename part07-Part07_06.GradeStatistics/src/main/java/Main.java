
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
       // ArrayList<Integer> list = new ArrayList<>();
       UserInterface ui = new UserInterface(grades, scanner);
       ui.start();
        
        
      
    }

   /* public static double pointsAverage(ArrayList<Integer> list) {
        int sum = 0;

        for (int holdPoints : list) {
            sum += holdPoints;
        }

        return 1.0 * sum / list.size();
    }

    public static double averageOfPointsForPassed(ArrayList<Integer> list) {
        int passed = 0;
        int sum = 0;
        for (int points : list) {
            if (points >= 50) {
                sum += points;
                passed++;

            } else {
                System.out.println("-");
            }
        }
        return (double) sum / passed;

    }
    
    public static double passPercentage(ArrayList<Integer>list){
       int numberOfPassed = 0;
       for(int getNoOfPassed:list){
           if(getNoOfPassed >=50){
               numberOfPassed++;
           }
       }
       
       
        return  100 *  numberOfPassed / list.size();
    }
    
    public static int gradeDistribution(ArrayList<Integer>list){
        int grade =  0;
       
        for(int grader:list){
            if(grader < 50){
                grade = 0;
            } else if(grader < 60){
                grade = 1;
            } else if(grader < 70){
                grade = 2;
                
            }else if(grader < 80){
                grade = 3;
            } else if(grader < 90){
                grade = 4;
            } else {
                grade = 5;
            }
        }
        return grade;
    }
    
    public static void printStars(int star){
        while(star > 0){
            System.out.println("*");
            star--;
        }
    }
    
    public static void printDistribution(ArrayList<Integer> list){
        
        for(int grades : list){
            grades = gradeDistribution(list);
             while(grades >=0){
                 System.out.print(grades + ":");
                 printStars(grades);
                 System.out.println("");
                 
                 grades -=1;
             }
        } 
        
        
        
        
    }
    */
}
