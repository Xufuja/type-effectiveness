package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class TypeEfficacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "damage_type_id")
    private int damageTypeId;
    @Column(name = "target_type_id")
    private int targetTypeId;
    @Column(name = "damage_factor")
    private int damageFactor;

    public int getDamageTypeId() {
        return damageTypeId;
    }

    public int getTargetTypeId() {
        return targetTypeId;
    }

    public int getDamageFactor() {
        return damageFactor;
    }
}
