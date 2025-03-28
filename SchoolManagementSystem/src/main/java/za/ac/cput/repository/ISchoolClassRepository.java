package za.ac.cput.repository;

import za.ac.cput.domain.SchoolClass;

import java.util.List;

public interface ISchoolClassRepository {
    SchoolClass create(SchoolClass schoolclass);
    SchoolClass read(String classId);
    SchoolClass update(SchoolClass schoolClass);
    boolean delete(String classId);
    List<SchoolClass> getAll();
}

