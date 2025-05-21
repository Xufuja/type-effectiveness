package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class Types {
    @Id
    private int id;
    private String identifier;
    @Column(name = "generation_id")
    private int generationId;
    @Column(name = "damage_class_id")
    private int damageClassId;

    public int getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getGenerationId() {
        return generationId;
    }

    public int getDamageClassId() {
        return damageClassId;
    }
}
