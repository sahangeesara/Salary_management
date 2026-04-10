package com.online.service;

import com.online.Model.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    void deleteDepartment(Integer id);
}

