package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pm_id")
    private Integer pmId;
    @Column(name = "typeId")
    private Integer typeId;
    private Integer slot;

}
