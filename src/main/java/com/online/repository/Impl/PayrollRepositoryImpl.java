package com.online.repository.Impl;

import com.online.Model.Payroll;
import com.online.repository.PayrollRepository;

import java.util.List;

public class PayrollRepositoryImpl implements PayrollRepository {
    @Override
    public List<Payroll> getPayroll() {
        return List.of();
    }

    @Override
    public Boolean addPayroll(Payroll payroll) {
        return false;
    }

    @Override
    public Boolean updatePayroll(Payroll payroll) {
        return false;
    }

    @Override
    public void deletePayroll(Integer id) {

    }
}
