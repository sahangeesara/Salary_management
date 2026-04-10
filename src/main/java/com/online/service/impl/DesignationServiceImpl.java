package com.online.service.impl;

import com.online.Model.Designation;
import com.online.repository.DesignationRepository;
import com.online.service.DesignationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesignationServiceImpl implements DesignationService {
    private final DesignationRepository repository;

    @Override
    public List<Designation> getAllDesignations() {
        return repository.getAllDesignations();
    }

    @Override
    public Designation getDesignationById(Integer id) {
        return repository.getDesignationById(id);
    }

    @Override
    public boolean addDesignation(Designation designation) {
        return repository.addDesignation(designation);
    }

    @Override
    public boolean updateDesignation(Designation designation) {
        return repository.updateDesignation(designation);
    }

    @Override
    public void deleteDesignation(Integer id) {
        repository.deleteDesignation(id);
    }
}

