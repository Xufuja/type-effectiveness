package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class Types {
    @Id
    private Integer id;
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @Column(name = "damage_class_id")
    private Integer damageClassId;

    public Integer getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Integer getGenerationId() {
        return generationId;
    }

    public Integer getDamageClassId() {
        return damageClassId;
    }
}
