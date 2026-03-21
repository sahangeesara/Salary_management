package com.online.service.impl;

import com.online.Model.Allowance;
import com.online.repository.AllowanceRepository;
import com.online.service.AllowanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AllowanceServiceImpl implements AllowanceService {

    private AllowanceRepository repository;

    @Override
    public List<Allowance> getAllowance() {
        return repository.getAllowance();
    }

    @Override
    public Boolean addAllowance(Allowance allowance) {
        return repository.addAllowance(allowance);
    }

    @Override
    public Boolean updateAllowance(Allowance allowance) {
        return repository.updateAllowance(allowance);
    }

    @Override
    public void deleteAllowance(Integer id) {
        repository.deleteAllowance(id);
    }
}
