package com.online.repository;

import com.online.Model.SalaryRequest;

import java.util.List;

public interface SalaryRequestRepository {
    List<SalaryRequest> getSalaryRequest();
    Boolean addSalaryRequest(SalaryRequest salaryRequest);
    Boolean updateSalaryRequest(SalaryRequest salaryRequest);
    void deleteSalaryRequest(Integer id);
}
