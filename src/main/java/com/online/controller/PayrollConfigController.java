package com.online.controller;

import com.online.Model.PayrollConfig;
import com.online.service.PayrollConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payroll-config")
@CrossOrigin
@RequiredArgsConstructor
public class PayrollConfigController {
    private final PayrollConfigService service;

    @GetMapping("/get-all")
    public List<PayrollConfig> getAll(){
        return service.getPayrollConfig();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody PayrollConfig payrollConfig){
        return service.createPayrollConfig(payrollConfig);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody PayrollConfig payrollConfig){
        return service.updatePayrollConfig(payrollConfig);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        service.deletePayrollConfig(id);
    }
}
