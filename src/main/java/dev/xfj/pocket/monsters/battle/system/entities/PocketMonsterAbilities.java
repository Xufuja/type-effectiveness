package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterAbilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pm_id")
    private Integer pmId;
    @Column(name = "ability_id")
    private Integer abilityId;
    @Column(name = "is_hidden")
    private Integer isHidden;
    private Integer slot;

}
