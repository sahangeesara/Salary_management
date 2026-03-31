package com.online.service;

import com.online.Model.BasicSalary;

import java.util.List;
import java.util.Map;

public interface BasicSalaryService {
    List<BasicSalary> getBasicSalary();
    Boolean addBasicSalary(BasicSalary basicSalary);
    Boolean updateBasicSalary(BasicSalary basicSalary);
    void deleteBasicSalary(Integer id);
    Map<String, Double> getBasicSalaryByRole(String role);

}
