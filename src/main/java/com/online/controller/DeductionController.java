package com.online.controller;

import com.online.Model.Deduction;
import com.online.service.DeductionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deduction")
@CrossOrigin
public class DeductionController {
    private DeductionService service;
    @GetMapping("/get-all")
    public List<Deduction> getAll(){
        return service.getDeduction();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody Deduction deduction){
        return service.addDeduction(deduction);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Deduction deduction){
        return service.updateDeduction(deduction);
    }

    @DeleteMapping("/delete")
    public void delete(Integer id){
        service.deleteDeduction(id);
    }

}
