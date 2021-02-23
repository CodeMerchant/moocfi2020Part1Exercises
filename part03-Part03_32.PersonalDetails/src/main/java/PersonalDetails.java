
import java.util.Scanner;

public class PersonalDetails {

    /*
    Write a program that reads names and birth years from the user until an empty 
    line is entered. The name and birth year are separated by a comma.
    
    After that the program prints the longest name and the average of the
    birth years. If multiple names are equally longest, you can print
    any of them. You can assume that the user enters at least one person.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
       // String oldest = "";
        int currentWordLength = 0;
        int sum = 0;
        int count = 0;
        //int age = 0;

        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] splitText = text.split(",");

            sum += Integer.valueOf(splitText[1]);
            count = count + 1;
            
            String names = splitText[0];
            int wordLength = names.length();
            
          /*  int ages = Integer.valueOf(splitText[2]);
            if(ages > age){
                age = ages;
                oldest = names;
            } */

            if (wordLength > currentWordLength) {
                currentWordLength = wordLength;
                longest = names;
            }

        }
        System.out.println("Longest name: " + longest);
       // System.out.println("Age of oldest: " + age + " || Name of oldest: " + oldest);
        System.out.println("----------------------------------------------------");
        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
