package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.Moves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesRepository extends JpaRepository<Moves, String> {
}
