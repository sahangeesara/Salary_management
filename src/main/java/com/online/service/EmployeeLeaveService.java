package com.online.service;

import com.online.Model.EmployeeLeave;

import java.util.List;

public interface EmployeeLeaveService {
    List<EmployeeLeave> getEmployeeLeave();
    Boolean addEmployeeLeave(EmployeeLeave employeeLeave);
    Boolean updateEmployeeLeave(EmployeeLeave employeeLeave);
    void deleteEmployeeLeave(Integer id);
}
