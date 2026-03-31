package com.online.service;


import com.online.Model.Bonus;

import java.util.List;

public interface BonusService {
    List<Bonus> getBonus();
    Boolean addBonus(Bonus bonus);
    Boolean updateBonus(Bonus bonus);
    void deleteBonus(Integer id);

    List<Bonus> searchBonusById(Integer id);
}
