package com.online.service;

import com.online.Model.SalaryResponse;

import java.util.List;

public interface SalaryResponseService {
    List<SalaryResponse> getSalaryResponse();
    Boolean addSalaryResponse(SalaryResponse salaryResponse);
    Boolean updateSalaryResponse(SalaryResponse salaryResponse);
    void deleteSalaryResponse(Integer id);
}
