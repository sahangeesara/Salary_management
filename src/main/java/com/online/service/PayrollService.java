package com.online.service;

import com.online.Model.Payroll;

import java.util.List;

public interface PayrollService {
    List<Payroll> getPayroll();
    Boolean addPayroll(Payroll payroll);
    Boolean updatePayroll(Payroll payroll);
    void deletePayroll(Integer id);
}
