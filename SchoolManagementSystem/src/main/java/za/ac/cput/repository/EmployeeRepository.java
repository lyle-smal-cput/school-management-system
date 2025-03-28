package za.ac.cput.repository;

import za.ac.cput.domain.*;

import java.util.*;

public class EmployeeRepository implements IRepository<String, Employee>{

    private final Map<String, Employee> employeeDatabase = new HashMap<>();

    public void save(Employee employee) {
        employeeDatabase.put(employee.getEmpNum(), employee);
    }

    public void findByEmpNum(String empNum) {
        employeeDatabase.get(empNum);
    }

    @Override
    public String create(String s) {
        return "";
    }

    @Override
    public String read(Employee employee) {
        return "";
    }

    @Override
    public String update(String s) {
        return "";
    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }
}
