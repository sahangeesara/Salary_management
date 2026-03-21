package com.online.repository;

import com.online.Model.PayrollConfig;

import java.util.List;

public interface PayrollConfigRepository {
    List<PayrollConfig> getPayrollConfig();
    Boolean addPayrollConfig(PayrollConfig payrollConfig);
    Boolean updatePayrollConfig(PayrollConfig payrollConfig);
    void deletePayrollConfig(Integer id);
}
