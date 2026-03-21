package com.online.repository.Impl;

import com.online.Model.SalaryResponse;
import com.online.repository.SalaryResponseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class SalaryResponseRepositoryImpl implements SalaryResponseRepository {
    @Override
    public List<SalaryResponse> getSalaryResponse() {
        return List.of();
    }

    @Override
    public Boolean addSalaryResponse(SalaryResponse salaryResponse) {
        return null;
    }

    @Override
    public Boolean updateSalaryResponse(SalaryResponse salaryResponse) {
        return null;
    }

    @Override
    public void deleteSalaryResponse(Integer id) {

    }
}
