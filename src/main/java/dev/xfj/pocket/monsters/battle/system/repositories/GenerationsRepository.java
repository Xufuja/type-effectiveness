package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.Generations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenerationsRepository extends JpaRepository<Generations, String> {
}
