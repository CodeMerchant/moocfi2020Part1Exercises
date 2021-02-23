
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment a1 = new Apartment(1, 16, 5500);
        Apartment a2 = new Apartment(2, 38, 4200);
        Apartment a3 = new Apartment(3, 78, 2500);

        System.out.println(a1.largerThan(a2));
        System.out.println(a3.largerThan(a1));
        System.out.println(a2.largerThan(a3));

        System.out.println(a1.priceDifference(a2));
        System.out.println(a3.priceDifference(a2));

        System.out.println(a1.moreExpensiveThan(a2));
        System.out.println(a3.moreExpensiveThan(a2));
    }
}
