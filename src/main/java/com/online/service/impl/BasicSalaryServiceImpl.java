package com.online.service.impl;

import com.online.Model.BasicSalary;
import com.online.repository.BasicSalaryRepository;
import com.online.service.BasicSalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BasicSalaryServiceImpl implements BasicSalaryService {

    private final BasicSalaryRepository repository;
    @Override
    public List<BasicSalary> getBasicSalary() {
        return repository.getBasicSalary();
    }

    @Override
    public Boolean addBasicSalary(BasicSalary basicSalary) {
        return repository.addBasicSalary(basicSalary);
    }

    @Override
    public Boolean updateBasicSalary(BasicSalary basicSalary) {
        return repository.updateBasicSalary(basicSalary);
    }

    @Override
    public void deleteBasicSalary(Integer id) {
        repository.deleteBasicSalary(id);
    }
}
