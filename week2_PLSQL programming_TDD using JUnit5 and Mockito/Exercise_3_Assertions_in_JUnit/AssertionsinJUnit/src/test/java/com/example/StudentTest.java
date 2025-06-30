package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testNameNotNull() {
        Student s = new Student("Alice", new int[]{90, 85, 95});
        assertNotNull(s.getName());
        assertEquals("Alice", s.getName());
        assertNotEquals("Bob", s.getName());
    }

    @Test
    void testAverageCalculation() {
        Student s = new Student("Bob", new int[]{80, 85, 90});
        double avg = s.getAverage();
        assertEquals(85.0, avg, 0.001);
        assertTrue(avg >= 80);
        assertFalse(avg < 80);
    }

    @Test
    void testThrowsExceptionOnEmptyMarks() {
        Student s = new Student("Charlie", new int[]{});
        Exception exception = assertThrows(IllegalArgumentException.class, s::getAverage);
        assertEquals("Marks cannot be empty", exception.getMessage());
    }

    @Test
    void testNullMarks() {
        Student s = new Student("David", null);
        Exception exception = assertThrows(IllegalArgumentException.class, s::getAverage);
        assertEquals("Marks cannot be empty", exception.getMessage());
    }
}
