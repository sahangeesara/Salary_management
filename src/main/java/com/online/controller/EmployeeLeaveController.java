package com.online.controller;

import com.online.Model.Employee;
import com.online.Model.EmployeeLeave;
import com.online.service.EmployeeLeaveService;
import com.online.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-leave")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeLeaveController {
    private EmployeeLeaveService service;

    @GetMapping("/get-all")
    public List<EmployeeLeave> getAll(){
        return service.getEmployeeLeave();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody EmployeeLeave employeeleave){
        return service.addEmployeeLeave(employeeleave);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody EmployeeLeave employeeleave){
        return service.updateEmployeeLeave(employeeleave);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        service.deleteEmployeeLeave(id);
    }
}
