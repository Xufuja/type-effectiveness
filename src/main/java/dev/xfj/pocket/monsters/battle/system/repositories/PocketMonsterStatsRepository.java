package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsterStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonsterStatsRepository extends JpaRepository<PocketMonsterStats, String> {
}
