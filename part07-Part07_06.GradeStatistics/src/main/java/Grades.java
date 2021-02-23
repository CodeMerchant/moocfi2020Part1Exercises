
import java.util.ArrayList;

/**
 *
 * @author musa
 */
public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passed;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.passed = new ArrayList<>();
    }

    /**
     * Method that adds students marks/points to the respective lists
     *
     * @param points value that needs to be passed to the method in order to add
     * it to the list(s).
     */
    public void addPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));

        if (points >= 50) {
            this.passed.add(points);
        }
    }

    /**
     * Method that calculates and returns the average of all the student marks
     *
     * @return average of students total marks.
     */
    public double pointsAverage() {
        int sum = 0;

        for (int holdPoints : this.points) {
            sum += holdPoints;
        }

        return 1.0 * sum / this.points.size();
    }

    /**
     * Method that returns the average mark for all the students that passed.
     * Method does not take into consideration the marks of those that failed.
     *
     * @return average mark for those that passed.
     */
    public double averageOfPointsForPassed() {

        int sum = 0;
        for (int points : this.passed) {
            sum += points;
        }

        return (double) sum / this.passed.size();

    }

    /**
     * Method that returns the points percentage of all the students that passed
     *
     * @return returns the points percentage of all students that passed
     */
    public double passPercentage() {

        return 100 * ((double) this.passed.size() / this.points.size());
    }

    /**
     *Method that returns the total of a given grade for the entire class
     * @param grade a variable between 0 and 5 to help check how many students scored within that grade level.
     * 
     * @return returns the amount of grade levels found in the list (eg. if the grade level passed was 3, the program
     * checks how many grade levels of 3 appear in the list and appends the counter variable. )
     */
    public int numberOfGrades(int grade) {
        int counter = 0;
        for (int gradesList : this.grades) {
            if (gradesList == grade) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Method that converts points to grade level.
     *
     * @param points variable that is used to determine the grade level of the
     * point being passed
     * @return grade level is returned with 5 being the highest level that can
     * be returned.
     */
    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

}
