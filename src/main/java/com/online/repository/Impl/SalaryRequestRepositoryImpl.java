package com.online.repository.Impl;

import com.online.Model.SalaryRequest;
import com.online.repository.SalaryRequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class SalaryRequestRepositoryImpl implements SalaryRequestRepository {

    @Override
    public List<SalaryRequest> getSalaryRequest() {
        return List.of();
    }

    @Override
    public Boolean addSalaryRequest(SalaryRequest salaryRequest) {
        return null;
    }

    @Override
    public Boolean updateSalaryRequest(SalaryRequest salaryRequest) {
        return null;
    }

    @Override
    public void deleteSalaryRequest(Integer id) {

    }
}
