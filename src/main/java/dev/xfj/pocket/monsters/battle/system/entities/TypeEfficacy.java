package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class TypeEfficacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "damage_type_id")
    private Integer damageTypeId;
    @Column(name = "target_type_id")
    private Integer targetTypeId;
    @Column(name = "damage_factor")
    private Integer damageFactor;

    public Integer getId() {
        return id;
    }

    public Integer getDamageTypeId() {
        return damageTypeId;
    }

    public Integer getTargetTypeId() {
        return targetTypeId;
    }

    public Integer getDamageFactor() {
        return damageFactor;
    }
}
