package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GrowthRates {
    @Id
    private Integer id;
    private String identifier;
    private String formula;
}
