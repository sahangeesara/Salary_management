package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Deduction {

    private int id;
    private int employeeId;

    private String type; // EPF / TAX / LOAN / DONATION
    private double amount;
}
