package com.online.service;

import com.online.Model.Allowance;


import java.util.List;

public interface AllowanceService {
    List<Allowance> getAllowance();
    Boolean addAllowance(Allowance allowance);
    Boolean updateAllowance(Allowance allowance);
    void deleteAllowance(Integer id);
    List<Allowance> getAllowanceByType(String type);

}
