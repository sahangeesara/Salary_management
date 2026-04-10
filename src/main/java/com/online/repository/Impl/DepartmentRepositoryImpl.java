package com.online.repository.Impl;

import com.online.Model.Department;
import com.online.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Department> getAllDepartments() {
        String sql = "SELECT * FROM department";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Department(
                rs.getInt("id"),
                rs.getString("name")
        ));
    }

    @Override
    public Department getDepartmentById(Integer id) {
        String sql = "SELECT * FROM department WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Department(
                rs.getInt("id"),
                rs.getString("name")
        ), id);
    }

    @Override
    public boolean addDepartment(Department department) {
        String sql = "INSERT INTO department (name) VALUES (?)";
        return jdbcTemplate.update(sql, department.getName()) > 0;
    }

    @Override
    public boolean updateDepartment(Department department) {
        String sql = "UPDATE department SET name = ? WHERE id = ?";
        return jdbcTemplate.update(sql, department.getName(), department.getId()) > 0;
    }

    @Override
    public void deleteDepartment(Integer id) {
        String sql = "DELETE FROM department WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}

