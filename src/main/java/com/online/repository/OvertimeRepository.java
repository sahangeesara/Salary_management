package com.online.repository;

import com.online.Model.Overtime;

import java.util.List;

public interface OvertimeRepository {
    List<Overtime> getOvertime();
    Boolean addOvertime(Overtime overtime);
    Boolean updateOvertime(Overtime overtime);
    void deleteOvertime(Integer id);
}
