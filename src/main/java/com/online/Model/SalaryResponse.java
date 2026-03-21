package com.online.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SalaryResponse {

    private Double basicSalary;

    private Double epfEmployee;
    private Double epfEmployer;
    private Double etfEmployer;

    private Double donation;
    private Double totalDeduction;
    private Double netSalary;

    private Double employerCost;
}
