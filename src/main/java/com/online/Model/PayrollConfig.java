package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PayrollConfig {

    private int id;
    private double epfEmployeeRate; // default 0.08
    private double epfEmployerRate; // default 0.12
    private double etfRate;         // default 0.03
}
