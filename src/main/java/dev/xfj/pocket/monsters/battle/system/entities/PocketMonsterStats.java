package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pm_id")
    private Integer pmId;
    @Column(name = "stat_id")
    private Integer statId;
    @Column(name = "base_stat")
    private Integer baseStat;
    private Integer effort;
}
