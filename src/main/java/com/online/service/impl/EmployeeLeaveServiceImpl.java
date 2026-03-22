package com.online.service.impl;

import com.online.Model.EmployeeLeave;
import com.online.repository.EmployeeLeaveRepository;
import com.online.service.EmployeeLeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService {
    private final EmployeeLeaveRepository repository;
    @Override
    public List<EmployeeLeave> getEmployeeLeave() {
        return repository.getEmployeeLeave();
    }

    @Override
    public Boolean addEmployeeLeave(EmployeeLeave employeeLeave) {
        return repository.addEmployeeLeave(employeeLeave);
    }

    @Override
    public Boolean updateEmployeeLeave(EmployeeLeave employeeLeave) {
        return repository.updateEmployeeLeave(employeeLeave);
    }

    @Override
    public void deleteEmployeeLeave(Integer id) {
            repository.deleteEmployeeLeave(id);
    }
}
