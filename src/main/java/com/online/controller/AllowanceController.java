package com.online.controller;

import com.online.Model.Allowance;
import com.online.Model.Employee;
import com.online.service.AllowanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allowance")
@CrossOrigin
public class AllowanceController {
    private AllowanceService service;
    @GetMapping("/get-all")
    public List<Allowance> getAll(){
        return service.getAllowance();
    }

    @PostMapping("/add")
    public Boolean addEmployee(@RequestBody Allowance allowance){
        return service.addAllowance(allowance);
    }

    @PutMapping("/update")
    public Boolean updateEmployee(@RequestBody Allowance allowance){
        return service.updateAllowance(allowance);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Integer id){
        service.deleteAllowance(id);
    }
}
