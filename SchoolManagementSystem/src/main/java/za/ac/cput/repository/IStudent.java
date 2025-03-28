/*
Student.java
Student model class
Author: Christian Smith(221242597)
March 2025

*/
package za.ac.cput.repository;


import za.ac.cput.domain.Student;

import java.util.List;
import java.util.Set;

public interface IStudent extends IRepository<String, Student> {

    List<Student> getAll();

}
