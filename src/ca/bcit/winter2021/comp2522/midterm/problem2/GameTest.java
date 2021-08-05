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
        TransformersTeam soundwave = new TransformersTeam(
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
        TransformersTeam bluestreak = new TransformersTeam(
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
        TransformersTeam hubcap = new TransformersTeam(
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
        ArrayList<TransformersTeam> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(bluestreak);
        transformers.add(hubcap);

        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Soundwave");
        assertEquals(result.survivingMembersOfLosingTeam, "Hubcap");
    }

    @Test
    void test_whenTransformerNamedOptimusPrimeOrPredakingWinsAnytime() {
        TransformersTeam soundwave = new TransformersTeam(
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
        TransformersTeam optimusPrime = new TransformersTeam(
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

        ArrayList<TransformersTeam> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(optimusPrime);
        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Optimus Prime");
        assertEquals(result.survivingMembersOfLosingTeam, "");
    }
}