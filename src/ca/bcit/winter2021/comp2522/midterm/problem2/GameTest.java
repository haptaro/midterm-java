package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void test_dataFile_firstBattle() {
        Transformer megatron = TestDataFactory.fixture(FixtureName.MEGATRON);
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);
        Transformer computron = TestDataFactory.fixture(FixtureName.COMPUTRON);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(megatron);
        transformers.add(predaking);
        transformers.add(optimusPrime);
        transformers.add(computron);

        game.start(transformers);

        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: (Autobots): Optimus Prime";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        assertEquals(expectedNumberOfBattles, game.formatedNumberOfBattles);
        assertEquals(expectedWinningTeam, game.formatedWinningTeam);
        assertEquals(expectedSurvivingMembersOfLosingTeam, game.formatedSurvivingMembersOfLosingTeam);
    }
}