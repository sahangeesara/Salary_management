package com.online.service.impl;

import com.online.Model.Deduction;
import com.online.repository.DeductionRepository;
import com.online.service.DeductionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeductionServiceImpl implements DeductionService {
    private final DeductionRepository repository;
    @Override
    public List<Deduction> getDeduction() {
        return repository.getDeduction();
    }

    @Override
    public Boolean addDeduction(Deduction deduction) {
        return repository.addDeduction(deduction);
    }

    @Override
    public Boolean updateDeduction(Deduction deduction) {
        return repository.updateDeduction(deduction);
    }

    @Override
    public void deleteDeduction(Integer id) {
            repository.deleteDeduction(id);
    }
}
