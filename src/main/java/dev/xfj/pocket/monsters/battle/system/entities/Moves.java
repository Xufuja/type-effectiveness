package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Moves {
    @Id
    private Integer id;
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @Column(name = "type_id")
    private Integer typeId;
    private Integer power;
    private Integer pp;
    private Integer accuracy;
    private Integer priority;
    @Column(name = "target_id")
    private Integer targetId;
    @Column(name = "damage_class_id")
    private Integer damageClassId;
    @Column(name = "effect_id")
    private Integer effectId;
    @Column(name = "effect_chance")
    private Integer effectChance;
    @Column(name = "contest_type_id")
    private Integer contestTypeId;
    @Column(name = "contest_effect_id")
    private Integer contestEffectId;
    @Column(name = "super_contest_effect_id")
    private Integer superContestEffectId;

    public Integer getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Integer getGenerationId() {
        return generationId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getPp() {
        return pp;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public Integer getPriority() {
        return priority;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public Integer getDamageClassId() {
        return damageClassId;
    }

    public Integer getEffectId() {
        return effectId;
    }

    public Integer getEffectChance() {
        return effectChance;
    }

    public Integer getContestTypeId() {
        return contestTypeId;
    }

    public Integer getContestEffectId() {
        return contestEffectId;
    }

    public Integer getSuperContestEffectId() {
        return superContestEffectId;
    }
}
