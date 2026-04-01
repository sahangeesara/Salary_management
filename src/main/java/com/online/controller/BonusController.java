package com.online.controller;


import com.online.Model.Bonus;
import com.online.service.BonusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bonus")
@CrossOrigin
@RequiredArgsConstructor
public class BonusController {
    private final BonusService service;
    @GetMapping("/get-all")
    public List<Bonus> getAll(){
        return service.getBonus();
    }

    @PostMapping("/add")
    public Boolean save(@RequestBody Bonus bonus){
        return service.addBonus(bonus);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Bonus bonus){
        return service.updateBonus(bonus);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteBonus(id);
    }

    @GetMapping("/search/{id}")
    public List<Bonus> searchByName(@PathVariable Integer id) {
        return service.searchBonusById(id);
    }
}
