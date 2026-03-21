package com.online.repository.Impl;

import com.online.Model.Allowance;
import com.online.repository.AllowanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@AllArgsConstructor
public class AllowanceRepositoryImpl implements AllowanceRepository {
    @Override
    public List<Allowance> getAllowance() {
        return List.of();
    }

    @Override
    public Boolean addAllowance(Allowance Allowance) {
        return null;
    }

    @Override
    public Boolean updateAllowance(Allowance Allowance) {
        return null;
    }

    @Override
    public void deleteAllowance(Integer id) {

    }
}
