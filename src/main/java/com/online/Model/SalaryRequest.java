package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalaryRequest {

    private int employeeId;
    private double basicSalary;
    private double donation;
}
