package com.student.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    private final App app = new App();

    @Test
    @DisplayName("Should correctly calculate the sum of marks")
    void testCalculateTotal() {
        double[] marks = {70.0, 80.0, 90.0};
        assertEquals(240.0, app.calculateTotal(marks), "Sum should be 240.0");
    }

    @Test
    @DisplayName("Should correctly calculate percentage")
    void testCalculatePercentage() {
        assertEquals(80.0, app.calculatePercentage(240.0, 3), "Percentage should be 80.0");
    }

    @Test
    @DisplayName("Should assign correct grades based on percentage")
    void testAssignGrade() {
        assertAll("Grade Boundaries",
            () -> assertEquals("A+", app.assignGrade(95.0)),
            () -> assertEquals("A", app.assignGrade(85.0)),
            () -> assertEquals("B", app.assignGrade(75.0)),
            () -> assertEquals("C", app.assignGrade(65.0)),
            () -> assertEquals("D", app.assignGrade(55.0)),
            () -> assertEquals("F", app.assignGrade(40.0))
        );
    }

    @Test
    @DisplayName("Should handle empty marks or zero subjects")
    void testEdgeCases() {
        assertEquals(0, app.calculateTotal(new double[]{}), "Empty array should result in 0");
        assertEquals(0, app.calculatePercentage(0, 0), "Dividing by zero subjects should return 0");
    }
}
