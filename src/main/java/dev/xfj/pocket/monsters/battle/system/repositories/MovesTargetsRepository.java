package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.MoveTargets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesTargetsRepository extends JpaRepository<MoveTargets, String> {
}
