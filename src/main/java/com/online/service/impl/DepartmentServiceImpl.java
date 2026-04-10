package com.online.service.impl;

import com.online.Model.Department;
import com.online.repository.DepartmentRepository;
import com.online.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;

    @Override
    public List<Department> getAllDepartments() {
        return repository.getAllDepartments();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return repository.getDepartmentById(id);
    }

    @Override
    public boolean addDepartment(Department department) {
        return repository.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return repository.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(Integer id) {
        repository.deleteDepartment(id);
    }
}

