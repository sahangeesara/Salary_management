package com.online.service.impl;

import com.online.Model.Bonus;
import com.online.repository.BonusRepository;
import com.online.service.BonusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BonusServiceImpl implements BonusService {
    private final BonusRepository repository;
    @Override
    public List<Bonus> getBonus() {
        return repository.getBonus();
    }

    @Override
    public Boolean addBonus(Bonus bonus) {
        return repository.addBonus(bonus);
    }

    @Override
    public Boolean updateBonus(Bonus bonus) {
        return repository.updateBonus(bonus);
    }

    @Override
    public void deleteBonus(Integer id) {
        repository.deleteBonus(id);
    }

    @Override
    public List<Bonus> searchBonusById(Integer id) {
            return repository.searchBonusById(id);
    }
}
