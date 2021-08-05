package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void test_overallRatings() {
        Transformer soundwave = new Transformer(
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
        assertEquals(31, soundwave.overallRating());

        Transformer bluestreak = new Transformer(
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
        assertEquals(37, bluestreak.overallRating());

        Transformer hubcap = new Transformer(
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
        assertEquals(20, hubcap.overallRating());


        Transformer predaking = new Transformer(
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
        assertEquals(32, predaking.overallRating());
    }
}