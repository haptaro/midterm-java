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