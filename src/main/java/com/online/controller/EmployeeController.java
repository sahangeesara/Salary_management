package com.online.controller;

import com.online.Model.Employee;
import com.online.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {
    private EmployeeService service;

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return service.getEmployee();
    }

    @PostMapping("/add")
    public Boolean addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @PutMapping("/update")
    public Boolean updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Integer id){
            service.deleteEmployee(id);
    }
}
