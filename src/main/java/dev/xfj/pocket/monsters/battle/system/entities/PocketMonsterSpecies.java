package dev.xfj.pocket.monsters.battle.system.entities;

import jakarta.persistence.*;

@Entity
public class PocketMonsterSpecies {
    @Id
    private Integer id;
    private String identifier;
    @Column(name = "generation_id")
    private Integer generationId;
    @Column(name = "evolves_from_species_id")
    private Integer evolvesFromSpeciesId;
    @Column(name = "evolution_chain_id")
    private Integer evolutionChainId;
    @Column(name = "color_id")
    private Integer colorId;
    @Column(name = "shape_id")
    private Integer shapeId;
    @Column(name = "habitat_id")
    private Integer habitatId;
    @Column(name = "gender_rate")
    private Integer genderRate;
    @Column(name = "capture_rate")
    private Integer captureRate;
    @Column(name = "base_happiness")
    private Integer baseHappiness;
    @Column(name = "is_baby")
    private Integer isBaby;
    @Column(name = "hatch_counter")
    private Integer hatchCounter;
    @Column(name = "has_gender_differences")
    private Integer hasGenderDifferences;
    @Column(name = "growth_rate_id")
    private Integer growthRateId;
    @Column(name = "forms_switchable")
    private Integer formsSwitchable;
    @Column(name = "is_legendary")
    private Integer isLegendary;
    @Column(name = "is_mythical")
    private Integer isMythical;
    @Column(name = "order_")
    private Integer order;
    @Column(name = "conquest_order")
    private Integer conquestOrder;
}
