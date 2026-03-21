package com.online.service.impl;

import com.online.Model.Overtime;
import com.online.repository.OvertimeRepository;
import com.online.service.OvertimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OvertimeServiceImpl implements OvertimeService {
    private final OvertimeRepository repository;
    public List<Overtime> getOvertime() {
        return repository.getOvertime();
    }

    @Override
    public Boolean addOvertime(Overtime overtime) {
        return repository.addOvertime(overtime);
    }

    @Override
    public Boolean updateOvertime(Overtime overtime) {
        return repository.updateOvertime(overtime);
    }

    @Override
    public void deleteOvertime(Integer id) {
            repository.deleteOvertime(id);
    }
}
