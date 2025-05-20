package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.Types;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypesRepository extends JpaRepository<Types, String> {
}
