package com.mnluan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTypeTest {

    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleType.calcFormat(5, 5, 5));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleType.calcFormat(5, 5, 8));
    }

    @Test
    void testAcuteTriangle() {
        assertEquals("Acute", TriangleType.calcFormat(10, 9, 5));
    }

    @Test
    void testObtuseTriangle() {
        assertEquals("Obtuse", TriangleType.calcFormat(3, 4, 6));
    }

    @Test
    void testRightTriangle() {
        assertEquals("Right", TriangleType.calcFormat(3, 4, 5));
    }

    @Test
    void testCalcArea() {
        assertEquals("And Its Area is 6,75cm", TriangleType.calcArea(3.0, 4.5, 5.5));
    }

    @Test
    void testIsTriangle() {
        assertTrue(TriangleType.isTriangle(3, 4, 5));
        assertFalse(TriangleType.isTriangle(1, 2, 3));
    }
}