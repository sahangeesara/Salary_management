package com.online.repository;

import com.online.Model.Payroll;

import java.util.List;

public interface PayrollRepository {
    List<Payroll> getPayroll();
    Boolean addPayroll(Payroll payroll);
    Boolean updatePayroll(Payroll payroll);
    void deletePayroll(Integer id);
}
