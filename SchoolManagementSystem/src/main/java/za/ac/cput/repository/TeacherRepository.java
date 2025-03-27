package za.ac.cput.repository;

import za.ac.cput.domain.*;

import java.util.*;

public class TeacherRepository {

    private final Map<String, Teacher> teacherDatabase = new HashMap<>();

    public void save(Teacher teacher) {
        teacherDatabase.put(teacher.getEmpNum(), teacher);
    }

    public void findByEmpNum(String empNum) {
        teacherDatabase.get(empNum);
    }
}
