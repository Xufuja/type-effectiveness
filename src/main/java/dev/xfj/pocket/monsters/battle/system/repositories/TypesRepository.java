package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.Types;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypesRepository extends JpaRepository<Types, String> {
    Optional<Types> findByIdentifier(String identifier);
}
