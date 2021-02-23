
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(3);
        numList.add(2);
        numList.add(6);
        numList.add(-1);
        numList.add(5);
        numList.add(1);
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numList, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numList, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> rangeList, int lowerLimit, int upperLimit) {
        for (int numbers : rangeList) {
            if (numbers >= lowerLimit && numbers <= upperLimit) {
                System.out.println(numbers);
            }
        }
    }
}
