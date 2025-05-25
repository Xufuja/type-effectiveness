package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PocketMonsters {
    @Id
    private Integer id;
    private String identifier;
    @Column(name = "species_id")
    private Integer speciesId;
    private Integer height;
    private Integer weight;
    @Column(name = "base_experience")
    private Integer baseExperience;
    @Column(name = "order_")
    private Integer order;
    @Column(name = "is_default")
    private Integer isDefault;
}
