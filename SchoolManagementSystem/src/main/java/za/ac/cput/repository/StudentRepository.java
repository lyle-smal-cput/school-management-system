/*
StudentRepository.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/

package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IStudent {
    private static StudentRepository repository = null;
    private Set<Student> studentSet;

    // Private constructor to prevent direct instantiation
    private StudentRepository() {
        studentSet = new HashSet<>();
    }

    // Singleton pattern to get the instance of StudentRepository
    public static IStudent getRepository() {
        if (repository == null) {
            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student create(Student student) {
        boolean success = studentSet.add(student);
        return success ? student : null;  // Return the student if added successfully
    }

    @Override
    public Student read(String id) {
        // Search for the student by studentID
        for (Student student : studentSet) {
            if (student.getStudentID().equals(id)) {
                return student;
            }
        }
        return null;  // Return null if student not found
    }

    @Override
    public Student update(Student student) {
        // Check if the student exists in the repository
        Student existingStudent = read(student.getStudentID());
        if (existingStudent == null) {
            return null;  // Return null if student doesn't exist
        }
        // Remove and re-add to simulate an update
        boolean removed = delete(student.getStudentID());
        if (removed) {
            studentSet.add(student);
            return student;  // Return the updated student
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        // Search and delete the student by studentID
        Student studentToDelete = read(id);
        return studentToDelete != null && studentSet.remove(studentToDelete);  // Remove and return success/failure
    }

    @Override
    public Set<Student> getAll() {
        return studentSet;  // Return all students in the repository
    }

    @Override
    public String create(String s) {
        return "";
    }

    @Override
    public String read(Student student) {
        return "";
    }

    @Override
    public String update(String s) {
        return "";
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }
}