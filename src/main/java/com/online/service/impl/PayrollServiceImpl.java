package com.online.service.impl;

import com.online.Model.Payroll;
import com.online.repository.PayrollRepository;
import com.online.service.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollServiceImpl implements PayrollService {
    private PayrollRepository repository;
    @Override
    public List<Payroll> getPayroll() {
        return repository.getPayroll();
    }

    @Override
    public Boolean addPayroll(Payroll payroll) {
        return repository.addPayroll(payroll);
    }

    @Override
    public Boolean updatePayroll(Payroll payroll) {
        return repository.updatePayroll(payroll);
    }

    @Override
    public void deletePayroll(Integer id) {
            repository.deletePayroll(id);
    }
}
