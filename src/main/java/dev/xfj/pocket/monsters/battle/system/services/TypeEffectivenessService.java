package dev.xfj.pocket.monsters.battle.system.services;

import dev.xfj.pocket.monsters.battle.system.constant.Type;
import dev.xfj.pocket.monsters.battle.system.entities.TypeEfficacy;
import dev.xfj.pocket.monsters.battle.system.entities.Types;
import dev.xfj.pocket.monsters.battle.system.repositories.TypeEfficacyRepository;
import dev.xfj.pocket.monsters.battle.system.repositories.TypesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class TypeEffectivenessService {
    private static final Logger log = LoggerFactory.getLogger(TypeEffectivenessService.class);
    private final TypeEfficacyRepository typeEfficacyRepository;
    private final TypesRepository typesRepository;

    @Autowired
    public TypeEffectivenessService(TypeEfficacyRepository typeEfficacyRepository, TypesRepository typesRepository) {
        this.typeEfficacyRepository = typeEfficacyRepository;
        this.typesRepository = typesRepository;
    }

    public double getMultiplier(Type attackType, Type... arguments) {
        if (attackType == null) {
            throw new IllegalArgumentException("No attack type provided!");
        }

        if (arguments == null || arguments.length < 1) {
            throw new IllegalArgumentException("At least 1 defender type required!");
        }

        if (arguments.length > 2) {
            log.warn("More than 2 defender types submitted, ignoring everything after the first 2!");
        }

        return Arrays.stream(Arrays.copyOfRange(arguments, 0, Math.clamp(arguments.length, 1, 2)))
                .map(entry -> getDamageFactor(attackType, entry))
                .mapToDouble(multiplier -> multiplier / 100.0)
                .reduce(1.0, (a, b) -> a * b);
    }

    private int getDamageFactor(Type attackType, Type defendType) {
        Optional<Types> attack = typesRepository.findByIdentifier(attackType.name().toLowerCase());
        Optional<Types> defend = typesRepository.findByIdentifier(defendType.name().toLowerCase());

        if (attack.isPresent() && defend.isPresent()) {
            Optional<TypeEfficacy> efficacy = typeEfficacyRepository.findByDamageTypeIdAndTargetTypeId(
                    attack.get().getId(),
                    defend.get().getId()
            );

            if (efficacy.isPresent()) {
                return efficacy.get().getDamageFactor();
            }
        }

        throw new EntityNotFoundException("Type(s) not in database!");
    }
}
