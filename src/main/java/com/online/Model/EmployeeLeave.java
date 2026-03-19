package com.online.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class EmployeeLeave {

    private int id;
    private int employeeId;

    private String leaveType; // ANNUAL / CASUAL / SICK
    private LocalDate startDate;
    private LocalDate endDate;

    private int totalDays;
    private String status; // PENDING / APPROVED / REJECTED
    private String reason;
}
