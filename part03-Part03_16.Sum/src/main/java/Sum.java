
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(3);
        numList.add(2);
        numList.add(6);
        numList.add(-1);
        System.out.println(sum(numList));
        numList.add(5);
        numList.add(1);
        System.out.println(sum(numList));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int total : numbers) {
            sum += total;
        }
        return sum;
    }
}
