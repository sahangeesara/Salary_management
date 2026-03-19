package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Allowance {

    private int id;
    private int employeeId;

    private String type; // Transport / Meal / Other
    private double amount;
}
