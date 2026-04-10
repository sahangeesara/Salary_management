package com.online.repository;

import com.online.Model.Designation;
import java.util.List;

public interface DesignationRepository {
    List<Designation> getAllDesignations();
    Designation getDesignationById(Integer id);
    boolean addDesignation(Designation designation);
    boolean updateDesignation(Designation designation);
    void deleteDesignation(Integer id);
}

