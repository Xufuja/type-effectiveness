package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.PocketMonsterMoves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketMonsterMovesRepository extends JpaRepository<PocketMonsterMoves, String> {
}
