package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Overtime {

    private int id;
    private int employeeId;

    private LocalDate date;

    private double hours;
    private double ratePerHour;

    private double totalAmount;
}
