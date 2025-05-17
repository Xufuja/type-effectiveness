package dev.xfj.logic;

import dev.xfj.constant.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TypeEffectivenessTest {
    @Test
    void singleTypeVersusSingleType() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.FLYING));
    }

    @Test
    void singleTypeVersusDualType() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.FLYING, Type.GROUND));
    }

    @Test
    void noEffectiveness() {
        assertEquals(0.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.GHOST));
    }

    @Test
    void lowEffectiveness() {
        assertEquals(0.25, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.ROCK, Type.STEEL));
    }

    @Test
    void mediumLowEffectiveness() {
        assertEquals(0.50, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.ROCK));
    }

    @Test
    void mediumEffectiveness() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.NORMAL));
    }

    @Test
    void mediumHighEffectiveness() {
        assertEquals(2.0, TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL));
    }

    @Test
    void HighEffectiveness() {
        assertEquals(4.0, TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK));
    }

    @Test
    void singleTypeVersusTripleType() {
        assertEquals(
                TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK),
                TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK, Type.BUG)
        );
    }

    @Test
    void singleTypeVersusNoType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> TypeEffectiveness.getMultiplier(Type.NORMAL));

        assertEquals("At least 1 defender type required!", exception.getMessage());
    }

    @Test
    void noTypeVersusSingleType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> TypeEffectiveness.getMultiplier(null, Type.NORMAL));

        assertEquals("No attack type provided!", exception.getMessage());
    }

    @Test
    void noTypeVersusNoType() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> TypeEffectiveness.getMultiplier(null));

        assertEquals("No attack type provided!", exception.getMessage());
    }
}
