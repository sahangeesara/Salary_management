package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private int id;
    private int user_id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private double basicSalary;
    private double allowance;
    private double bonus;
    private double donation;

    private String department;
    private String designation;
    private String status; // ACTIVE / INACTIVE
}
