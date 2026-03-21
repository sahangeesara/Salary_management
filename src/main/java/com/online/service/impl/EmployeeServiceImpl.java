package com.online.service.impl;

import com.online.Model.Employee;
import com.online.repository.EmployeeRepository;
import com.online.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public List<Employee> getEmployee() {
        return repository.getEmployee();
    }

    public Boolean addEmployee(Employee employee) {
        return repository.addEmployee(employee);
    }

    @Override
    public Boolean updateEmployee(Employee employee) {
        return repository.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        repository.deleteEmployee(id);
    }

}
