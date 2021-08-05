package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

// refs:
// http://www.ntfa.net/ntfa/techspecs/index.php?cat=Gen1&group=DeceptPZ&char=Rampage

class GameTest {
    private Game game;
    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void test_sample() {
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
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(bluestreak);
        transformers.add(hubcap);

        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Soundwave");
        assertEquals(result.survivingMembersOfLosingTeam, "Hubcap");
    }

    @Test
    void test_whenTransformerNamedOptimusPrimeWinsAnytime() {
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
        Transformer optimusPrime = new Transformer(
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

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(optimusPrime);
        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Optimus Prime");
        assertEquals(result.survivingMembersOfLosingTeam, "");
    }

    @Test
    void test_whenTransformerNamedPredakingWinsAnytime() {
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

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(predaking);
        transformers.add(bluestreak);
        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Predaking");
        assertEquals(result.survivingMembersOfLosingTeam, "");
    }

    @Test
    void test_battle_with_basic_transformers() {
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
        ); // 31

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
        ); // 37

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(bluestreak);
        Result result = game.fight(transformers);

        assertEquals(1, result.numberOfBattles);
        assertEquals("Bluestreak", result.winningTeam);
        assertEquals("", result.survivingMembersOfLosingTeam);
    }
}