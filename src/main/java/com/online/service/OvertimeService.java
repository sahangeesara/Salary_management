package com.online.service;

import com.online.Model.Overtime;

import java.util.List;

public interface OvertimeService {
    List<Overtime> getOvertime();
    Boolean addOvertime(Overtime overtime);
    Boolean updateOvertime(Overtime overtime);
    void deleteOvertime(Integer id);
}
