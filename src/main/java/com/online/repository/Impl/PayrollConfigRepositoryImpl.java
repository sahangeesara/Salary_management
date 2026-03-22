package com.online.repository.Impl;

import com.online.Model.PayrollConfig;
import com.online.repository.PayrollConfigRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PayrollConfigRepositoryImpl implements PayrollConfigRepository {

    @Override
    public List<PayrollConfig> getPayrollConfig() {
        return List.of();
    }

    @Override
    public Boolean addPayrollConfig(PayrollConfig payrollConfig) {
        return false;
    }

    @Override
    public Boolean updatePayrollConfig(PayrollConfig payrollConfig) {
        return false;
    }

    @Override
    public void deletePayrollConfig(Integer id) {

    }
}
