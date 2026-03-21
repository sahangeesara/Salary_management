package com.online.repository.Impl;

import com.online.Model.Employee;
import com.online.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployee() {
        return List.of();
    }

    public Boolean addEmployee(Employee employee) {
        String sql = """
            INSERT INTO employee
            (user_id, firstName, lastName, email, phone, basicSalary, department,designation)
            VALUES (?, ?, ?, ?, ?, ?, ?,?)
        """;

        return jdbcTemplate.update(
                sql,
                employee.getUser_id(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getBasicSalary(),
                employee.getDepartment(),
                employee.getDesignation()
        ) > 0;
    }

    @Override
    public Boolean updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Integer id) {

    }

}
