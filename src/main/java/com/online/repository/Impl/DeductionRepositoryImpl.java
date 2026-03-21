package com.online.repository.Impl;

import com.online.Model.Deduction;
import com.online.repository.DeductionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class DeductionRepositoryImpl implements DeductionRepository {
    @Override
    public List<Deduction> getDeduction() {
        return List.of();
    }

    @Override
    public Boolean addDeduction(Deduction deduction) {
        return null;
    }

    @Override
    public Boolean updateDeduction(Deduction deduction) {
        return null;
    }

    @Override
    public void deleteDeduction(Integer id) {

    }
}
