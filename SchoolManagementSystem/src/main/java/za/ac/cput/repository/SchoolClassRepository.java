package za.ac.cput.repository;
/* SchoolClassRepository.java
SchoolClassRepository
Author: Siya Rasmeni(222906073)
Date: 28 March 2025
*/

import za.ac.cput.domain.SchoolClass;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassRepository implements ISchoolClassRepository {
    private static SchoolClassRepository repository = null;
    private List<SchoolClass> schoolClassList;

    private SchoolClassRepository() {
        schoolClassList = new ArrayList<>();
    }

    public static SchoolClassRepository getRepository() {
        if (repository == null) {
            repository = new SchoolClassRepository();
        }
        return repository;
    }

    @Override
    public SchoolClass create(SchoolClass schoolClass) {
        boolean success = schoolClassList.add(schoolClass);
        if (success) {
            return schoolClass;
        }
        return null;
    }

    @Override
    public SchoolClass read(String classId) {
        return schoolClassList.stream()
                .filter(s -> s.getClassId().equals(classId))
                .findAny()
                .orElse(null);
    }

    @Override
    public SchoolClass update(SchoolClass schoolClass) {
        String classId = schoolClass.getClassId();
        if (delete(classId)) {
            if (create(schoolClass) != null) {
                return schoolClass;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String classId) {
        SchoolClass schoolClassToDelete = read(classId);
        if (schoolClassToDelete == null) {
            return false;
        }
        return schoolClassList.remove(schoolClassToDelete);
    }

    @Override
    public List<SchoolClass> getAll() {
        return schoolClassList;
    }
}


