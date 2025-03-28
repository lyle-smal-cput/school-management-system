package za.ac.cput.repository;


import za.ac.cput.domain.Student;

import java.util.Set;

public interface IStudent extends IRepository {
    Set<Student> getAll();

}
