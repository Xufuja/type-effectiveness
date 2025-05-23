package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Generations {
    @Id
    private Integer id;
    @Column(name = "main_region_id")
    private Integer mainRegionId;
    private String identifier;

    public Integer getId() {
        return id;
    }

    public Integer getMainRegionId() {
        return mainRegionId;
    }

    public String getIdentifier() {
        return identifier;
    }
}
