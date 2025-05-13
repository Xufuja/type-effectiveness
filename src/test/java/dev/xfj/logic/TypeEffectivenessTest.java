package dev.xfj.logic;

import dev.xfj.constant.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeEffectivenessTest {
    @Test
    void singleTypeVersusSingleType() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.FLYING)) ;
    }

    @Test
    void singleTypeVersusDualType() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.FLYING, Type.GROUND)) ;
    }

    @Test
    void noEffectiveness() {
        assertEquals(0.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.GHOST)) ;
    }

    @Test
    void lowEffectiveness() {
        assertEquals(0.25, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.ROCK, Type.STEEL)) ;
    }

    @Test
    void mediumLowEffectiveness() {
        assertEquals(0.50, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.ROCK)) ;
    }

    @Test
    void mediumEffectiveness() {
        assertEquals(1.0, TypeEffectiveness.getMultiplier(Type.NORMAL, Type.NORMAL)) ;
    }

    @Test
    void mediumHighEffectiveness() {
        assertEquals(2.0, TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL)) ;
    }

    @Test
    void HighEffectiveness() {
        assertEquals(4.0, TypeEffectiveness.getMultiplier(Type.FIGHTING, Type.NORMAL, Type.ROCK)) ;
    }
}
