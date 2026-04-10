package com.online.controller;

import com.online.Model.Allowance;
import com.online.service.AllowanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/allowance")
@CrossOrigin
@RequiredArgsConstructor
public class AllowanceController {
    private final AllowanceService service;
    @GetMapping("/get-all")
    public List<Allowance> getAll(){
        return service.getAllowance();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody Allowance allowance){
        return service.addAllowance(allowance);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Allowance allowance){
        return service.updateAllowance(allowance);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        service.deleteAllowance(id);
    }

    @GetMapping("/get-allowance/{type}")
    public List<Allowance> getByAllowanceType(@PathVariable String type) {
        return service.getAllowanceByType(type);
    }
}

