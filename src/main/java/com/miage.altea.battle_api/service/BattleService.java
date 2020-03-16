package com.miage.altea.battle_api.service;


import com.miage.altea.battle_api.bo.Battle;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BattleService {
    Battle createBattle(String trainer, String opponent);

    List<Battle> getAllBattles();
}
