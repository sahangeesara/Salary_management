package com.online.service;

import com.online.Model.BasicSalary;

import java.util.List;

public interface BasicSalaryService {
    List<BasicSalary> getBasicSalary();
    Boolean addBasicSalary(BasicSalary basicSalary);
    Boolean updateBasicSalary(BasicSalary basicSalary);
    void deleteBasicSalary(Integer id);
}
