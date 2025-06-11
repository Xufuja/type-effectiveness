package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class Abilities {
    @Id
    private Integer id;
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @Column(name = "is_main_series")
    private Integer isMainSeries;
    private Integer slot;
}
