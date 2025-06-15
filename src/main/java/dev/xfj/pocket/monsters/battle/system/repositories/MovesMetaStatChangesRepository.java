package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.MoveMetaStatChanges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesMetaStatChangesRepository extends JpaRepository<MoveMetaStatChanges, String> {
}
