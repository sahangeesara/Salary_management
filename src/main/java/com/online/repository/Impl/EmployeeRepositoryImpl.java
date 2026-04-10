package com.online.repository.Impl;

import com.online.Model.Employee;
import com.online.Model.Department;
import com.online.Model.Designation;
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
        String sql = "SELECT e.*, d.id as dept_id, d.name as dept_name, g.id as desig_id, g.name as desig_name FROM employee e LEFT JOIN department d ON e.department_id = d.id LEFT JOIN designation g ON e.designation_id = g.id";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Employee(
                rs.getInt("id"),
                rs.getInt("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getDouble("basic_salary"),
                rs.getDouble("allowance"),
                rs.getDouble("bonus"),
                rs.getDouble("donation"),
                new Department(rs.getInt("dept_id"), rs.getString("dept_name")),
                new Designation(rs.getInt("desig_id"), rs.getString("desig_name")),
                rs.getString("status")
        ));
    }

    public Boolean addEmployee(Employee employee) {
        String sql = """
            INSERT INTO employee
            (user_id, first_name, last_name, email, phone, basic_salary, allowance, bonus, donation, department_id, designation_id, status)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;

        return jdbcTemplate.update(
                sql,
                employee.getUser_id(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getBasicSalary(),
                employee.getAllowance(),
                employee.getBonus(),
                employee.getDonation(),
                employee.getDepartment() != null ? employee.getDepartment().getId() : null,
                employee.getDesignation() != null ? employee.getDesignation().getId() : null,
                employee.getStatus()
        ) > 0;
    }

    @Override
    public Boolean updateEmployee(Employee employee) {
        String sql ="UPDATE employee SET user_id = ?, first_name = ?, last_name = ?, email = ?, phone = ?, basic_salary=?, allowance=?, bonus=?, donation=?, department_id=?, designation_id=?, status=? WHERE id = ?";

        return jdbcTemplate.update(
                sql,
                employee.getUser_id(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getBasicSalary(),
                employee.getAllowance(),
                employee.getBonus(),
                employee.getDonation(),
                employee.getDepartment() != null ? employee.getDepartment().getId() : null,
                employee.getDesignation() != null ? employee.getDesignation().getId() : null,
                employee.getStatus(),
                employee.getId()
        ) > 0;
    }

    @Override
    public void deleteEmployee(Integer id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
    @Override
    public Employee getEmployeeById(Integer id) {
        String sql = "SELECT e.*, d.id as dept_id, d.name as dept_name, g.id as desig_id, g.name as desig_name FROM employee e LEFT JOIN department d ON e.department_id = d.id LEFT JOIN designation g ON e.designation_id = g.id WHERE e.id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Employee(
                rs.getInt("id"),
                rs.getInt("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getDouble("basic_salary"),
                rs.getDouble("allowance"),
                rs.getDouble("bonus"),
                rs.getDouble("donation"),
                new Department(rs.getInt("dept_id"), rs.getString("dept_name")),
                new Designation(rs.getInt("desig_id"), rs.getString("desig_name")),
                rs.getString("status")
        ), id);
    }
    @Override
    public Boolean updateEmployeeById(Integer id,Employee employee) {
        String sql = "UPDATE employee SET user_id = ?, first_name = ?, last_name = ?, email = ?, phone = ?, basic_salary=?, allowance=?, bonus=?, donation=?, department_id=?, designation_id=?, status=? WHERE id = ?";

        return jdbcTemplate.update(
                sql,
                employee.getUser_id(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getBasicSalary(),
                employee.getAllowance(),
                employee.getBonus(),
                employee.getDonation(),
                employee.getDepartment() != null ? employee.getDepartment().getId() : null,
                employee.getDesignation() != null ? employee.getDesignation().getId() : null,
                employee.getStatus(),
                id
        ) > 0;
    }

}
