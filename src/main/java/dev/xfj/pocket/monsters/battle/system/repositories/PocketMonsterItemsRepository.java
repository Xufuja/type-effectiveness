package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsterItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonsterItemsRepository extends JpaRepository<PocketMonsterItems, String> {
}
