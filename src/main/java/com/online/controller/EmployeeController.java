package com.online.controller;

import com.online.Model.Employee;
import com.online.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeService.getEmployee();
    }

    @PostMapping("/add")
    public Boolean addEmployee(@RequestBody Request requeast){
        return employeeService.addEmployee(requeast);
    }


}
