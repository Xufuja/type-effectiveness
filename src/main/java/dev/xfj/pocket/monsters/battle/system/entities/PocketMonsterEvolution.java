package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterEvolution {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "evolved_species_id")
    private Integer evolvedSpeciesId;
    @Column(name = "evolution_trigger_id")
    private Integer evolutionTriggerId;
    @Column(name = "trigger_item_id")
    private Integer triggerItemId;
    @Column(name = "minimum_level")
    private Integer minimumLevel;
    @Column(name = "gender_id")
    private Integer genderId;
    @Column(name = "location_id")
    private Integer locationId;
    @Column(name = "held_item_id")
    private Integer heldItemId;
    @Column(name = "time_of_day")
    private String timeOfDay;
    @Column(name = "known_move_id")
    private Integer knownMoveId;
    @Column(name = "known_move_type_id")
    private Integer knownMoveTypeId;
    @Column(name = "minimum_happiness")
    private Integer minimumHappiness;
    @Column(name = "minimum_beauty")
    private Integer minimumBeauty;
    @Column(name = "minimum_affection")
    private Integer minimumAffection;
    @Column(name = "relative_physical_stats")
    private Integer relativePhysicalStats;
    @Column(name = "party_species_id")
    private Integer partySpeciesId;
    @Column(name = "party_type_id")
    private Integer partyTypeId;
    @Column(name = "trade_species_id")
    private Integer tradeSpeciesId;
    @Column(name = "needs_overworld_rain")
    private Integer needsOverworldRain;
    @Column(name = "turn_upside_down")
    private Integer turnUpsideDown;

}
