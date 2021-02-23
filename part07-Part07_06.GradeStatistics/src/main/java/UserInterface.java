
import java.util.Scanner;

public class UserInterface {

    private Grades grades;
    private Scanner scan;

    public UserInterface(Grades grades, Scanner scan) {
        this.grades = grades;
        this.scan = scan;
    }

    public void start() {
        getPoints();
        averageOfAll();
        pointsAverageForPassed();
        percentageOfPassed();
        System.out.println("Grade Distribution: ");
        printGradeDistribution();

    }

    public void getPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int enterPoints = Integer.valueOf(this.scan.nextLine());

            if (enterPoints == -1) {
                break;
            }
            if (!(enterPoints < 0) && !(enterPoints > 100)) {
                this.grades.addPoints(enterPoints);
            }
        }
    }

    public void averageOfAll() {

        System.out.println("Point average (all): " + this.grades.pointsAverage());

    }

    public void pointsAverageForPassed() {
        //Thanks to chadwyk242 (GitHub) for this line
        String none = "-";
        if (this.grades.averageOfPointsForPassed() == 0.00) {
            System.out.println("Point average (passing): " + none);
        } else {
            System.out.println("Point average (passing): " + this.grades.averageOfPointsForPassed());
        }

    }

    public void percentageOfPassed() {
        System.out.println("Pass percentage: " + this.grades.passPercentage());
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = this.grades.numberOfGrades(grade);
            System.out.print(grade + ":");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
