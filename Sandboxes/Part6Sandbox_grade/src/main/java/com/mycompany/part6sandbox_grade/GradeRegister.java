package com.mycompany.part6sandbox_grade;

import java.util.ArrayList;

/**
 * A class that is responsible for keeping track of the numbers of different
 * grades students have received. In this class we can add grades according to
 * scores. We can also use this class to ask how many people have received a
 * certain grade. This class is usually called the program logic, a class that includes parts
 * that are crucial for the execution of the program such as functionalities that store info.
 *
 * @author musa
 */

public class GradeRegister {

    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrades(int points) {
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
