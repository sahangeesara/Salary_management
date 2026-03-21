package com.online.service.impl;

import com.online.Model.PayrollConfig;
import com.online.repository.PayrollConfigRepository;
import com.online.service.PayrollConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollConfigServiceImpl implements PayrollConfigService {
    private final PayrollConfigRepository repository;
    @Override
    public List<PayrollConfig> getPayrollConfig() {
        return repository.getPayrollConfig();
    }

    @Override
    public Boolean addPayrollConfig(PayrollConfig payrollConfig) {
        return repository.addPayrollConfig(payrollConfig);
    }

    @Override
    public Boolean updatePayrollConfig(PayrollConfig payrollConfig) {
        return repository.updatePayrollConfig(payrollConfig);
    }

    @Override
    public void deletePayrollConfig(Integer id) {
            repository.deletePayrollConfig(id);
    }
}
