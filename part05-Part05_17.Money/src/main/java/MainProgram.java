
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        Money c = new Money(6, 0);
        
        Money d = a.plus(b);
        
        System.out.println(d); //should return 15
        
        //testing lessThan method
        System.out.println(a.lessThan(b)); //should return false
        System.out.println(c.lessThan(a)); //should return true
        
        //testing out minus
        Money one = new Money(10, 0);
        Money two = new Money(3, 50);
        
        Money three = one.minus(two);
        
        System.out.println(three);
    }
}
