package za.ac.cput.repository;

import za.ac.cput.domain.*;

import java.util.List;

public interface ITeacher extends IRepository<String, Teacher> {

    List<Teacher> getAll();
}
