package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.Abilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilitiesRepository extends JpaRepository<Abilities, String> {
}
