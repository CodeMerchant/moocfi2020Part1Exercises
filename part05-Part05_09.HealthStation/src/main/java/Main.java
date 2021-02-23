
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        Person ethan = new Person("Ethan", 23, 178, 89);
        Person peter = new Person("Peter", 18, 190, 97);

        HealthStation hospital = new HealthStation();

        System.out.println(ethan.getName() + "'s weight: " + hospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + hospital.weigh(peter) + " kilos");

        hospital.feed(ethan);
        hospital.feed(ethan);
        hospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + "'s weight: " + hospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + hospital.weigh(peter) + " kilos");

        hospital.weigh(peter);
        hospital.weigh(ethan);

        System.out.println("weighings performed: " + hospital.weighings());
    }
}
