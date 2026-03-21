package com.online.repository.Impl;

import com.online.Model.BasicSalary;
import com.online.repository.BasicSalaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class BasicSalaryRepositoryImpl implements BasicSalaryRepository {

    @Override
    public List<BasicSalary> getBasicSalary() {
        return List.of();
    }

    @Override
    public Boolean addBasicSalary(BasicSalary basicSalary) {
        return null;
    }

    @Override
    public Boolean updateBasicSalary(BasicSalary basicSalary) {
        return null;
    }

    @Override
    public void deleteBasicSalary(Integer id) {

    }
}
