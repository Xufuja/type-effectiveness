package dev.xfj.pocket.monsters.battle.system.logic;

import dev.xfj.pocket.monsters.battle.system.constant.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TypeEffectiveness {
    private static final Logger log = LoggerFactory.getLogger(TypeEffectiveness.class);
    //From: https://codegolf.stackexchange.com/questions/55823/its-super-effective
    private static final String TYPE_CHART = """
            222221201222222222\
            421124104222214241\
            242221421224122222\
            222111210224222224\
            220424124421422222\
            214212421422224222\
            211122211124242241\
            022222242222242212\
            222224221112124224\
            222221424114224122\
            222244222411222122\
            221144121141222122\
            224202222241122122\
            242422221222212202\
            224242221114221422\
            222222221222222420\
            212222242222242211\
            242122221122222442""";

    public static double getMultiplier(Type attackType, Type... arguments) {
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
                .map(entry -> getTypeIndex(attackType, entry))
                .map(TYPE_CHART::charAt)
                .map(value -> Double.parseDouble(Character.toString(value)))
                .mapToDouble(multiplier -> multiplier / 2.0)
                .reduce(1.0, (a, b) -> a * b);
    }

    private static int getTypeIndex(Type attackType, Type defendType) {
        return attackType.ordinal() * Type.values().length + defendType.ordinal();
    }
}
