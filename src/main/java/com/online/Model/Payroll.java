package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Payroll {

    private int id;
    private int employeeId;

    private double basicSalary;
    private double epfEmployee;
    private double epfEmployer;
    private double etfEmployer;
    private double allowance;
    private double bonus;
    private double donation;

    private double overtimeAmount;
    private int leaveDays;
    private double leaveDeduction;

    private double totalDeduction;
    private double netSalary;
    private double employerCost;

    private LocalDate payrollDate;
}
