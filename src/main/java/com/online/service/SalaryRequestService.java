package com.online.service;

import com.online.Model.SalaryRequest;

import java.util.List;

public interface SalaryRequestService {
    List<SalaryRequest> getSalaryRequest();
    Boolean addSalaryRequest(SalaryRequest salaryRequest);
    Boolean updateSalaryRequest(SalaryRequest salaryRequest);
    void deleteSalaryRequest(Integer id);
}
