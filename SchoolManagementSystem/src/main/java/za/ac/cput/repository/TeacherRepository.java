package za.ac.cput.repository;

import za.ac.cput.domain.Teacher;

import java.util.List;

public class TeacherRepository implements IRepository, ITeacher {

    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public String create(String s) {
        return "";
    }

    @Override
    public String read(Teacher teacher) {
        return "";
    }

    @Override
    public String update(String s) {
        return "";
    }

    @Override
    public boolean delete(Teacher teacher) {
        return false;
    }
}
