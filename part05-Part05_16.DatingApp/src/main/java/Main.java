
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate today = new SimpleDate(13,2,2015);
        
        System.out.println(today);
        
       // System.out.println("after advancing by 7 days");
       // today.advance(7);
        
       // System.out.println("After 7 days the date is: " + today);
        
        System.out.println("");
        
        SimpleDate newDate = today.afterNumberOfDays(7);
        int week = 1;
        while(week <= 7){
            System.out.println("Friday after " + week + " week is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            
            week = week + 1;
        }
    }
}
