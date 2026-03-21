package com.online.repository;

import com.online.Model.BasicSalary;

import java.util.List;

public interface BasicSalaryRepository {
        List<BasicSalary> getBasicSalary();
        Boolean addBasicSalary(BasicSalary basicSalary);
        Boolean updateBasicSalary(BasicSalary basicSalary);
        void deleteBasicSalary(Integer id);
}
