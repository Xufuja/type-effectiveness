package dev.xfj.pocket.monsters.battle.system.repositories;

import dev.xfj.pocket.monsters.battle.system.entities.MoveMetaCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesMetaCategoriesRepository extends JpaRepository<MoveMetaCategories, String> {
}
