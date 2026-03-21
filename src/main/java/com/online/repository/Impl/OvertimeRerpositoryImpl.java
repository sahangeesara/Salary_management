package com.online.repository.Impl;

import com.online.Model.Overtime;
import com.online.repository.OvertimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class OvertimeRerpositoryImpl implements OvertimeRepository {
    @Override
    public List<Overtime> getOvertime() {
        return List.of();
    }

    @Override
    public Boolean addOvertime(Overtime overtime) {
        return null;
    }

    @Override
    public Boolean updateOvertime(Overtime overtime) {
        return null;
    }

    @Override
    public void deleteOvertime(Integer id) {

    }
}
