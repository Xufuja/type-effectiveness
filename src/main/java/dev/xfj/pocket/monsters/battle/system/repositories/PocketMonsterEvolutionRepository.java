package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsterEvolution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonsterEvolutionRepository extends JpaRepository<PocketMonsterEvolution, String> {
}
