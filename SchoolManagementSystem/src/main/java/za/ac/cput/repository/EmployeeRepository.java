package za.ac.cput.repository;

import za.ac.cput.domain.*;

import java.util.*;

public class EmployeeRepository {

    private final Map<String, Employee> employeeDatabase = new HashMap<>();

    public void save(Employee employee) {
        employeeDatabase.put(employee.getEmpNum(), employee);
    }

    public void findByEmpNum(String empNum) {
        employeeDatabase.get(empNum);
    }
}
