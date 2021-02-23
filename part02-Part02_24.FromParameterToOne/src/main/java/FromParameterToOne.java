
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int fromNum) {
        int i = 1;
        while (fromNum >= i) {            
            System.out.println(fromNum);
            fromNum--;
        }
    }
}
