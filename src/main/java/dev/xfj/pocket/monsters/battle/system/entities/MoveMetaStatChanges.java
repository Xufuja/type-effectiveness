package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class MoveMetaStatChanges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "move_id")
    private Integer moveId;
    @Column(name = "stat_id")
    private Integer statId;
    private Integer change;
}
