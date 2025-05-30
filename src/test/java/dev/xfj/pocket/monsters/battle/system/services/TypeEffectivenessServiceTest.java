package dev.xfj.pocket.monsters.battle.system.services;

import dev.xfj.pocket.monsters.battle.system.constant.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class TypeEffectivenessServiceTest {
    @Autowired
    private TypeEffectivenessService typeEffectivenessService;

    @Test
    void singleTypeVersusSingleType() {
        assertEquals(1.0, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.FLYING));
    }

    @Test
    void singleTypeVersusDualType() {
        assertEquals(1.0, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.FLYING, Type.GROUND));
    }

    @Test
    void noEffectiveness() {
        assertEquals(0.0, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.GHOST));
    }

    @Test
    void lowEffectiveness() {
        assertEquals(0.25, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.ROCK, Type.STEEL));
    }

    @Test
    void mediumLowEffectiveness() {
        assertEquals(0.50, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.ROCK));
    }

    @Test
    void mediumEffectiveness() {
        assertEquals(1.0, typeEffectivenessService.getMultiplier(Type.NORMAL, Type.NORMAL));
    }

    @Test
    void mediumHighEffectiveness() {
        assertEquals(2.0, typeEffectivenessService.getMultiplier(Type.FIGHTING, Type.NORMAL));
    }

    @Test
    void HighEffectiveness() {
        assertEquals(4.0, typeEffectivenessService.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK));
    }

    @Test
    void singleTypeVersusTripleType() {
        assertEquals(
                typeEffectivenessService.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK),
                typeEffectivenessService.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK, Type.BUG)
        );
    }

    @Test
    void singleTypeVersusNoType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> typeEffectivenessService.getMultiplier(Type.NORMAL));

        assertEquals("At least 1 defender type required!", exception.getMessage());
    }

    @Test
    void noTypeVersusSingleType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> typeEffectivenessService.getMultiplier(null, Type.NORMAL));

        assertEquals("No attack type provided!", exception.getMessage());
    }

    @Test
    void noTypeVersusNoType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> typeEffectivenessService.getMultiplier(null));

        assertEquals("No attack type provided!", exception.getMessage());
    }
}
