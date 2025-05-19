package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.TypeEfficacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeEfficacyRepository extends JpaRepository<TypeEfficacy, String> {
}
