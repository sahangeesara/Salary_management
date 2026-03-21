package com.online.controller;

import com.online.Model.BasicSalary;
import com.online.service.BasicSalaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/besic-salary")
@CrossOrigin
public class BasicSalaryController {
    private BasicSalaryService service;
    @GetMapping("/get-all")
    public List<BasicSalary> getAll(){
        return service.getBasicSalary();
    }

    @PostMapping("/add")
    public Boolean addEmployee(@RequestBody BasicSalary basicSalary){
        return service.addBasicSalary(basicSalary);
    }

    @PutMapping("/update")
    public Boolean updateEmployee(@RequestBody BasicSalary basicSalary){
        return service.updateBasicSalary(basicSalary);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Integer id){
        service.deleteBasicSalary(id);
    }
}
