package com.online.service;

import com.online.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee();
    Boolean addEmployee(Employee employee);
}
