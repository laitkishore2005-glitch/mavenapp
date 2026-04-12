package com.student.calculator;

import java.util.Arrays;

public class App {

    public double calculateTotal(double[] marks) {
        return Arrays.stream(marks).sum();
    }

    public double calculatePercentage(double total, int numberOfSubjects) {
        if (numberOfSubjects <= 0) return 0;
        return total / numberOfSubjects;
    }

    public String assignGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        App calculator = new App();
        
        // Example Usage
        double[] studentMarks = {85.5, 92.0, 78.0, 88.5, 95.0};
        double total = calculator.calculateTotal(studentMarks);
        double percentage = calculator.calculatePercentage(total, studentMarks.length);
        String grade = calculator.assignGrade(percentage);

        System.out.println("--- Student Results ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Final Grade: " + grade);
    }
}
