package za.ac.cput.repository;
/* ISchoolClassRepository.java
Repository interface
Author: Siya Rasmeni(222906073)
Date: 28 March 2025
*/
import za.ac.cput.domain.SchoolClass;

import java.util.List;

public interface ISchoolClassRepository {
    SchoolClass create(SchoolClass schoolclass);
    SchoolClass read(String classId);
    SchoolClass update(SchoolClass schoolClass);
    boolean delete(String classId);
    List<SchoolClass> getAll();
}

