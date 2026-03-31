package com.online.repository;



import com.online.Model.Bonus;

import java.util.List;

public interface BonusRepository {
    List<Bonus> getBonus();
    Boolean addBonus(Bonus bonus);
    Boolean updateBonus(Bonus bonus);
    void deleteBonus(Integer id);
    List<Bonus> searchBonusById(Integer id);
}
