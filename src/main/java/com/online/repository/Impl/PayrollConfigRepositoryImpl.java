package com.online.repository.Impl;

import com.online.Model.PayrollConfig;
import com.online.repository.PayrollConfigRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PayrollConfigRepositoryImpl implements PayrollConfigRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<PayrollConfig> getPayrollConfig() {
        String sql = "SELECT * FROM payroll_config";
        return jdbcTemplate.query(sql,
                (rs, rowNum) -> new PayrollConfig(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getDouble(3),
                        rs.getDouble(4)

                ));
    }

    @Override
    public Boolean addPayrollConfig(PayrollConfig payrollConfig) {
        String sql ="""
                        INSERT INTO payroll_config
                         (epfEmployeeRate,epfEmployerRate,etfRate)
                         VALUES(?,?,?)
                        """;
        return jdbcTemplate.update(sql,
                    payrollConfig.getEpfEmployeeRate(),
                    payrollConfig.getEpfEmployerRate(),
                    payrollConfig.getEtfRate()
                )>0;
    }

    @Override
    public Boolean updatePayrollConfig(PayrollConfig payrollConfig) {
        String sql ="UPDATE payroll_config SET epfEmployeeRate = ?, epfEmployerRate = ?, etfRate = ? WHERE id = ?";

        return jdbcTemplate.update(sql, payrollConfig.getEpfEmployeeRate(),
                                        payrollConfig.getEpfEmployerRate(),
                                        payrollConfig.getEtfRate(),
                                        payrollConfig.getId())>0;
    }

    @Override
    public void deletePayrollConfig(Integer id) {
            String sql ="DELETE FROM payroll_config WHERE id =?";
            jdbcTemplate.update(sql,id);
    }
}
