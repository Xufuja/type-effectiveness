package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterMoves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "pm_id")
    private Integer pmId;
    @Column(name = "version_group_id")
    private Integer versionGroupId;
    @Column(name = "move_id")
    private Integer moveId;
    @Column(name = "pm_move_method_id")
    private Integer pmMoveMethodId;
    private Integer level;
    @Column(name = "order_")
    private Integer order;
}
