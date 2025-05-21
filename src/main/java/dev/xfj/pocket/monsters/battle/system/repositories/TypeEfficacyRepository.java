package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.TypeEfficacy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeEfficacyRepository extends JpaRepository<TypeEfficacy, String> {
    Optional<TypeEfficacy> findByDamageTypeId(int damageTypeId);
    Optional<TypeEfficacy> findByTargetTypeId(int targetTypeId);
    Optional<TypeEfficacy> findByDamageTypeIdAndTargetTypeId(int damageTypeId, int targetTypeId);
}
