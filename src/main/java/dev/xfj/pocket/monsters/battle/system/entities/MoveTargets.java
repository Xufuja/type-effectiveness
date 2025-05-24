package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MoveTargets {
    @Id
    private Integer id;
    private String identifier;
}
