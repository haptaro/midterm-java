package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @BeforeEach
    void setUp() {
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

        Game game = new Game();
        Result result = game.fight(transformers);

        assertEquals(result.numberOfBattles, 1);
        assertEquals(result.winningTeam, "Soundwave");
        assertEquals(result.survivingMembersOfLosingTeam, "Hubcap");
    }
}