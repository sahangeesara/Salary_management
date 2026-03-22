package com.online.repository.Impl;

import com.online.Model.Payroll;
import com.online.repository.PayrollRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@AllArgsConstructor
public class PayrollRepositoryImpl implements PayrollRepository {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public List<Payroll> getPayroll() {
        String sql ="SELECT * FROM payroll";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Payroll(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getDouble(10),
                    rs.getInt(11),
                    rs.getDouble(12),
                    rs.getDouble(13),
                    rs.getDouble(14),
                    rs.getDouble(15),
                    rs.getDate(16).toLocalDate()
        ));
    }

    @Override
    public Boolean addPayroll(Payroll payroll) {
        String sql = """
                INSERT INTO payroll
                (employee_id,basic_salary,epf_employee,
                 epf_employer,etf_employer,allowance,bonus,
                 donation,overtime_amount,leave_days,leave_deduction,
                 total_deduction,net_salary,employer_cost,payroll_date)
                VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
                """;
        return jdbcTemplate.update(sql,
                    payroll.getEmployeeId(),
                    payroll.getBasicSalary(),
                    payroll.getEpfEmployee(),
                    payroll.getEpfEmployer(),
                    payroll.getEtfEmployer(),
                    payroll.getAllowance(),
                    payroll.getBonus(),
                    payroll.getDonation(),
                    payroll.getOvertimeAmount(),
                    payroll.getLeaveDays(),
                    payroll.getLeaveDeduction(),
                    payroll.getTotalDeduction(),
                    payroll.getNetSalary(),
                    payroll.getEmployerCost(),
                    payroll.getPayrollDate()
                )>0;
    }

    @Override
    public Boolean updatePayroll(Payroll payroll) {
        String sql = """
                        UPDATE payroll
                                        SET
                                            employee_id = ?,
                                            basic_salary = ?,
                                            epf_employee = ?,
                                            epf_employer = ?,
                                            etf_employer = ?,
                                            allowance = ?,
                                            bonus = ?,
                                            donation = ?,
                                            overtime_amount = ?,
                                            leave_days = ?,
                                            leave_deduction = ?,
                                            total_deduction = ?,
                                            net_salary = ?,
                                            employer_cost = ?,
                                            payroll_date = ?
                                        WHERE id = ?
                        """;
        return jdbcTemplate.update(sql,
                payroll.getEmployeeId(),
                payroll.getBasicSalary(),
                payroll.getEpfEmployee(),
                payroll.getEpfEmployer(),
                payroll.getEtfEmployer(),
                payroll.getAllowance(),
                payroll.getBonus(),
                payroll.getDonation(),
                payroll.getOvertimeAmount(),
                payroll.getLeaveDays(),
                payroll.getLeaveDeduction(),
                payroll.getTotalDeduction(),
                payroll.getNetSalary(),
                payroll.getEmployerCost(),
                payroll.getPayrollDate(),
                payroll.getId()
                )>0;
    }

    @Override
    public void deletePayroll(Integer id) {
        String sql = "DELETE FROM payroll WHERE id = ?";
        jdbcTemplate.update(sql, id);

    }
}
