package com.online.repository.Impl;

import com.online.Model.Designation;
import com.online.repository.DesignationRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class DesignationRepositoryImpl implements DesignationRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Designation> getAllDesignations() {
        String sql = "SELECT * FROM designation";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Designation(
                rs.getInt("id"),
                rs.getString("name")
        ));
    }

    @Override
    public Designation getDesignationById(Integer id) {
        String sql = "SELECT * FROM designation WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Designation(
                rs.getInt("id"),
                rs.getString("name")
        ), id);
    }

    @Override
    public boolean addDesignation(Designation designation) {
        String sql = "INSERT INTO designation (name) VALUES (?)";
        return jdbcTemplate.update(sql, designation.getName()) > 0;
    }

    @Override
    public boolean updateDesignation(Designation designation) {
        String sql = "UPDATE designation SET name = ? WHERE id = ?";
        return jdbcTemplate.update(sql, designation.getName(), designation.getId()) > 0;
    }

    @Override
    public void deleteDesignation(Integer id) {
        String sql = "DELETE FROM designation WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}

