/*
StudentFactory.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.factory;

import za.ac.cput.domain.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void testCreateStudent() {
        // Create student instance
        Student student = StudentFactory.createStudent("S001", "9901011234567", "John", "Doe", "Male",
                new Date(), null, null, new HashMap<>());

        // Assert the student was created successfully
        assertNotNull(student);
        assertEquals("S001", student.getStudentID());
        assertEquals("John", student.getFirstName());
    }

    @Test
    void testCreateStudentWithAllAttributes() {
        // Create another student with different attributes
        Student student = StudentFactory.createStudent("S002", "9802022345678", "Jane", "Smith", "Female",
                new Date(), null, null, new HashMap<>());

        // Assert the student was created successfully
        assertNotNull(student);
        assertEquals("S002", student.getStudentID());
        assertEquals("Jane", student.getFirstName());
    }
}