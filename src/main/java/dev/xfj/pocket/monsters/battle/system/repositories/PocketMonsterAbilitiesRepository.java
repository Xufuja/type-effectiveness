package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsterAbilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonsterAbilitiesRepository extends JpaRepository<PocketMonsterAbilities, String> {
}
