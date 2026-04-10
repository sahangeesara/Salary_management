package com.online.controller;

import com.online.Model.Designation;
import com.online.service.DesignationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/designations")
@RequiredArgsConstructor
public class DesignationController {
    private final DesignationService designationService;

    @GetMapping("/get-all")
    public List<Designation> getAllDesignations() {
        return designationService.getAllDesignations();
    }

    @GetMapping("/{id}")
    public Designation getDesignationById(@PathVariable Integer id) {
        return designationService.getDesignationById(id);
    }

    @PostMapping("/add")
    public boolean addDesignation(@RequestBody Designation designation) {
        return designationService.addDesignation(designation);
    }

    @PutMapping("/update")
    public boolean updateDesignation(@RequestBody Designation designation) {
        return designationService.updateDesignation(designation);
    }

    @DeleteMapping("/{id}")
    public void deleteDesignation(@PathVariable Integer id) {
        designationService.deleteDesignation(id);
    }
}

