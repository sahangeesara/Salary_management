package com.online.service;

import com.online.Model.Deduction;

import java.util.List;

public interface DeductionService {
    List<Deduction> getDeduction();
    Boolean addDeduction(Deduction deduction);
    Boolean updateDeduction(Deduction deduction);
    void deleteDeduction(Integer id);
}
