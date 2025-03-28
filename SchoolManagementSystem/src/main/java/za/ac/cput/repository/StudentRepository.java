/*
StudentRepository.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/


package za.ac.cput.repository;

import za.ac.cput.domain.Student;
import java.util.List;

public class StudentRepository {

    private List<Student> studentList;

    public StudentRepository(List<Student> studentList) {
        this.studentList = studentList;
    }

}