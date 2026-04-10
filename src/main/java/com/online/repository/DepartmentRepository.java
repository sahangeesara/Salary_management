package com.online.repository;

import com.online.Model.Department;
import java.util.List;

public interface DepartmentRepository {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    void deleteDepartment(Integer id);
}

