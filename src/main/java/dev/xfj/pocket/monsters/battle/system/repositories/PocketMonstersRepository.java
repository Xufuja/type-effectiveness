package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonstersRepository extends JpaRepository<PocketMonsters, String> {
}
