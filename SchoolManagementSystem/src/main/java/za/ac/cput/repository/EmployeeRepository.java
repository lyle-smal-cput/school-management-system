package za.ac.cput.repository;

import za.ac.cput.domain.*;

import java.util.*;

public class EmployeeRepository implements IRepository{

    private final Map<String, Employee> employeeDatabase = new HashMap<>();

    public void save(Employee employee) {
        employeeDatabase.put(employee.getEmpNum(), employee);
    }

    public void findByEmpNum(String empNum) {
        employeeDatabase.get(empNum);
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}
