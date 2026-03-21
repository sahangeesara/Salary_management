package com.online.repository;

import com.online.Model.Allowance;

import java.util.List;

public interface AllowanceRepository {
    List<Allowance> getAllowance();
    Boolean addAllowance(Allowance Allowance);
    Boolean updateAllowance(Allowance Allowance);
    void deleteAllowance(Integer id);
}
