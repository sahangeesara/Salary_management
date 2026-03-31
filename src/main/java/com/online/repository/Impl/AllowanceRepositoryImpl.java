package com.online.repository.Impl;

import com.online.Model.Allowance;
import com.online.repository.AllowanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@AllArgsConstructor
public class AllowanceRepositoryImpl implements AllowanceRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Allowance> getAllowance() {
        String sql = "SELECT * FROM allowance";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Allowance(
                rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getDouble(4)
        )) ;
    }

    @Override
    public Boolean addAllowance(Allowance allowance) {
        String sql = """
                INSERT INTO allowance
                (employee_id, type,amount) VALUES (?, ?,?)""";

        return jdbcTemplate.update(sql,
                 allowance.getEmployeeId(),
                 allowance.getType(),
                 allowance.getAmount())>0;

    }

    @Override
    public Boolean updateAllowance(Allowance allowance) {
        String sql ="UPDATE allowance SET amount = ? WHERE id = ?";
        return jdbcTemplate.update(sql,allowance.getAmount(),allowance.getId())>0;
    }

    @Override
    public void deleteAllowance(Integer id) {
        String sql = "DELETE FROM allowance WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Allowance> getAllowanceByType(String type) {
        // Try wrapping type in backticks just in case it's a reserved keyword
        String sql = "SELECT * FROM allowance WHERE `type` = ?";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Allowance(
                rs.getInt("id"),
                rs.getInt("employee_id"),
                rs.getString("type"),
                rs.getDouble("amount")
        ), type);
    }
}
