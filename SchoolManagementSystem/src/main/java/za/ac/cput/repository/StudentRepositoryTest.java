package za.ac.cput.repository;

/*
StudentRepository.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/



import org.junit.jupiter.api.*;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentRepositoryTest {

    private static IStudent repository = StudentRepository.getRepository();
    private Student student = StudentFactory.createStudent("S001", "9901011234567",
            "John", "Doe", "Male", new Date(), null, null, new HashMap<>());

    @Test
    @Order(1)
    void createStudent() {
        assertNotNull(repository.create(student));
    }

    @Test
    @Order(2)
    void readStudent() {
        String readStudent = repository.read(student.getStudentID());
        assertNotNull(readStudent);
        assertEquals(student.getStudentID(), readStudent.getStudentID());
    }

    @Test
    @Order(3)
    void updateStudent() {
        Student updatedStudent = new Student.Builder()
                .studentID(student.getStudentID())
                .firstName("Johnny")
                .build();

        assertNotNull(repository.update(String.valueOf(updatedStudent)));
        assertEquals("Johnny", updatedStudent.getFirstName());
    }

    @Test
    @Order(4)
    void deleteStudent() {
        assertTrue(repository.delete(student.getStudentID()));
    }

    @Test
    @Order(5)
    void getAllStudents() {
        assertFalse(repository.getAll().isEmpty());
    }
}