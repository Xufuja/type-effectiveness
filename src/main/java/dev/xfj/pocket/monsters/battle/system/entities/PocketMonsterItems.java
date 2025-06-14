package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pm_id")
    private Integer pmId;
    @Column(name = "version_id")
    private Integer versionId;
    @Column(name = "item_id")
    private Integer itemId;
    private Integer rarity;
}
