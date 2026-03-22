package com.online.controller;


import com.online.Model.Payroll;
import com.online.service.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
@CrossOrigin
@RequiredArgsConstructor
public class PayrollController {
    private final PayrollService service;

    @GetMapping("/get-all")
    public List<Payroll> getAll(){
        return service.getPayroll();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody Payroll payroll){
        return service.addPayroll(payroll);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Payroll payroll){
        return service.updatePayroll(payroll);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        service.deletePayroll(id);
    }
}
