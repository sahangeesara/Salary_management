package com.online.repository.Impl;

import com.online.Model.EmployeeLeave;
import com.online.repository.EmployeeLeaveRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeLeaveRepositoryImpl implements EmployeeLeaveRepository {
    @Override
    public List<EmployeeLeave> getEmployeeLeave() {
        return List.of();
    }

    @Override
    public Boolean addEmployeeLeave(EmployeeLeave employeeLeave) {
        return null;
    }

    @Override
    public Boolean updateEmployeeLeave(EmployeeLeave employeeLeave) {
        return null;
    }

    @Override
    public void deleteEmployeeLeave(Integer id) {

    }
}
