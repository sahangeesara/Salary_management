package com.online.repository;

import com.online.Model.SalaryResponse;

import java.util.List;

public interface SalaryResponseRepository {
    List<SalaryResponse> getSalaryResponse();
    Boolean addSalaryResponse(SalaryResponse salaryResponse);
    Boolean updateSalaryResponse(SalaryResponse salaryResponse);
    void deleteSalaryResponse(Integer id);
    
}
