package com.online.repository;

import com.online.Model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getEmployee();
    Boolean addEmployee(Employee employee);
    Boolean updateEmployee(Employee employee);
    void deleteEmployee(Integer id);

    Employee getEmployeeById(Integer id);
    Boolean updateEmployeeById(Integer id,Employee employee);
}
