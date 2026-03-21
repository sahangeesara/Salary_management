package com.online.service.impl;

import com.online.Model.SalaryResponse;
import com.online.repository.SalaryResponseRepository;
import com.online.service.SalaryResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalaryResponseServiceImpl implements SalaryResponseService {
    private final SalaryResponseRepository repository;
    @Override
    public List<SalaryResponse> getSalaryResponse() {
        return repository.getSalaryResponse();
    }

    @Override
    public Boolean addSalaryResponse(SalaryResponse salaryResponse) {
        return repository.addSalaryResponse(salaryResponse);
    }

    @Override
    public Boolean updateSalaryResponse(SalaryResponse salaryResponse) {
        return repository.updateSalaryResponse(salaryResponse);
    }

    @Override
    public void deleteSalaryResponse(Integer id) {
            repository.deleteSalaryResponse(id);
    }
}
