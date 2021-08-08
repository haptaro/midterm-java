package ca.bcit.winter2021.comp2522.midterm.problem2;

// refs:
// http://www.ntfa.net/ntfa/techspecs/index.php?cat=Gen1&group=DeceptPZ&char=Rampage

public class TestDataFactory {
    public static Transformer fixture(FixtureName name) {
        switch (name) {
            case SOUNDWAVE:
                return new Transformer(
                        "Soundwave",
                        TransformersType.DECEPTION,
                        8,
                        9,
                        2,
                        6,
                        7,
                        5,
                        6,
                        10
                );
            case PREDAKING:
                return new Transformer(
                        "Predaking",
                        TransformersType.DECEPTION,
                        10,
                        5,
                        0,
                        8,
                        7,
                        9,
                        9,
                        8
                );
            case REWIND:
                return new Transformer(
                        "Rewind",
                        TransformersType.AUTOBOT,
                        4,
                        9,
                        2,
                        7,
                        6,
                        7,
                        4,
                        8
                );
            case RAZORCLAW:
                return new Transformer(
                        "Razorclaw",
                        TransformersType.DECEPTION,
                        4,
                        5,
                        3,
                        6,
                        7,
                        2,
                        6,
                        10
                );
            case OPTIMUSPRIME:
                return new Transformer(
                        "Optimus Prime",
                        TransformersType.AUTOBOT,
                        1,
                        6,
                        8,
                        9,
                        5,
                        2,
                        9,
                        7
                );
            case SCAVENGER:
                return new Transformer(
                        "Scavenger",
                        TransformersType.DECEPTION,
                        5,
                        6,
                        7,
                        8,
                        9,
                        8,
                        7,
                        6
                );
            case COMPUTRON:
                return new Transformer(
                        "Computron",
                        TransformersType.AUTOBOT,
                        3,
                        5,
                        2,
                        1,
                        9,
                        2,
                        3,
                        2
                );
            case CLIFFJUMPER:
                return new Transformer(
                        "Cliffjumper",
                        TransformersType.DECEPTION,
                        8,
                        4,
                        7,
                        1,
                        9,
                        2,
                        3,
                        4
                );
            case BARRAGE:
                return new Transformer(
                        "Barrage",
                        TransformersType.DECEPTION,
                        8,
                        4,
                        7,
                        1,
                        9,
                        2,
                        3,
                        4
                );
            case FREEWAY:
                return new Transformer(
                        "Freeway",
                        TransformersType.AUTOBOT,
                        3,
                        3,
                        9,
                        9,
                        2,
                        2,
                        7,
                        8
                );
            case DIVEBOMB:
                return new Transformer(
                        "Divebomb",
                        TransformersType.DECEPTION,
                        4,
                        3,
                        2,
                        1,
                        3,
                        5,
                        7,
                        8
                );
            case SKYDIVE:
                return  new Transformer(
                        "Skydive",
                        TransformersType.AUTOBOT,
                        5,
                        9,
                        9,
                        5,
                        5,
                        9,
                        5,
                        9
                );
            case REPUGNUS:
                return  new Transformer(
                        "Repugnus",
                        TransformersType.AUTOBOT,
                        2,
                        2,
                        5,
                        9,
                        8,
                        2,
                        4,
                        7
                );
            case GEARS:
                return  new Transformer(
                        "Gears",
                        TransformersType.AUTOBOT,
                        3,
                        3,
                        7,
                        7,
                        1,
                        9,
                        7,
                        4
                );
            case DOUBLECROSS:
                return  new Transformer(
                        "Doublecross",
                        TransformersType.AUTOBOT,
                        1,
                        9,
                        2,
                        8,
                        3,
                        7,
                        4,
                        4
                );
            case HARDHEAD:
                return  new Transformer(
                        "Hardhead",
                        TransformersType.AUTOBOT,
                        5,
                        9,
                        7,
                        8,
                        7,
                        2,
                        9,
                        7
                );
            case SANDSTORM:
                return  new Transformer(
                        "Sandstorm",
                        TransformersType.AUTOBOT,
                        5,
                        5,
                        6,
                        6,
                        1,
                        9,
                        4,
                        4
                );
            case BLASTER:
                return  new Transformer(
                        "Blaster",
                        TransformersType.AUTOBOT,
                        3,
                        2,
                        7,
                        6,
                        5,
                        2,
                        9,
                        7
                );
            case KICKBACK:
                return  new Transformer(
                        "Kickback",
                        TransformersType.DECEPTION,
                        1,
                        1,
                        2,
                        2,
                        6,
                        6,
                        7,
                        7
                );
            case HEADSTRONG:
                return new Transformer(
                        "Headstrong",
                        TransformersType.DECEPTION,
                        4,
                        4,
                        5,
                        5,
                        6,
                        6,
                        7,
                        7
                );
            case CUTTHROAT:
                return  new Transformer(
                        "Cutthroat",
                        TransformersType.DECEPTION,
                        3,
                        3,
                        3,
                        8,
                        8,
                        8,
                        8,
                        8
                );
            case GRIMLOCK:
                return new Transformer(
                        "Grimlock",
                        TransformersType.AUTOBOT,
                        10,
                        7,
                        3,
                        10,
                        9,
                        10,
                        8,
                        10
                );
            case MEGATRON:
                return new Transformer(
                        "Megatron",
                        TransformersType.DECEPTION,
                        8,
                        3,
                        4,
                        6,
                        7,
                        1,
                        1,
                        10
                );
            case HUBCAP:
                return new Transformer(
                        "Hubcap",
                        TransformersType.AUTOBOT,
                        4,
                        4,
                        4,
                        4,
                        4,
                        4,
                        4,
                        4
                );
            case BLUESTREAK:
                return new Transformer(
                        "Bluestreak",
                        TransformersType.AUTOBOT,
                        6,
                        6,
                        7,
                        9,
                        5,
                        2,
                        9,
                        7
                );
            case TEST:
                return new Transformer(
                        "Test",
                        TransformersType.AUTOBOT,
                        8,
                        9,
                        2,
                        6,
                        7,
                        5,
                        6,
                        10
                );
            default:
                System.out.println(">>> Error");
        }
        return  null;
    }
}