
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter firstCounter = new Counter(4);
        Counter secondCounter = new Counter();

        System.out.println(firstCounter);
        firstCounter.increase();
        System.out.println(firstCounter);
        firstCounter.increase(5);
        System.out.println(firstCounter);
        firstCounter.decrease();
        System.out.println(firstCounter);
        firstCounter.decrease(2);
        System.out.println(firstCounter);

        System.out.println("---------------------");
        System.out.println("");

        System.out.println(secondCounter);
        secondCounter.increase();
        System.out.println(secondCounter);
        secondCounter.increase(4);
        System.out.println(secondCounter);
        secondCounter.decrease();
        System.out.println(secondCounter);
        secondCounter.decrease(-1);
        System.out.println(secondCounter);
    }
}
