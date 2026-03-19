package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalaryResponse {

    private double basicSalary;

    private double epfEmployee;
    private double epfEmployer;
    private double etfEmployer;

    private double donation;
    private double totalDeduction;
    private double netSalary;

    private double employerCost;
}
