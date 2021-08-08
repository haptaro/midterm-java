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
    void test_sample() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(bluestreak);
        transformers.add(hubcap);

        GameResult gameResult = game.fight(transformers);

        assertEquals(1, gameResult.numberOfBattles);
        assertEquals("DECEPTION", gameResult.winningTeam.type.name());
        // I don't know sort is ascending or descending, it lead to result of this
        assertEquals("Bluestreak", gameResult.survivingMembersOfLosingTeam.name);
    }

    @Test
    void test_whenTransformerNamedOptimusPrimeWinsAnytime() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(optimusPrime);
        GameResult gameResult = game.fight(transformers);

        assertEquals(1, gameResult.numberOfBattles);
        assertEquals("AUTOBOT", gameResult.winningTeam.type.name());
        assertEquals(null, gameResult.survivingMembersOfLosingTeam);
    }

    @Test
    void test_whenTransformerNamedPredakingWinsAnytime() {
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(predaking);
        transformers.add(bluestreak);
        GameResult gameResult = game.fight(transformers);

        assertEquals(1, gameResult.numberOfBattles);
        assertEquals("DECEPTION", gameResult.winningTeam.type.name());
        assertEquals(null, gameResult.survivingMembersOfLosingTeam);
    }

    @Test
    void test_battle_with_basic_transformers() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE); // 31
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK); // 37

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(bluestreak);
        GameResult gameResult = game.fight(transformers);

        assertEquals(1, gameResult.numberOfBattles);
        assertEquals("AUTOBOT", gameResult.winningTeam.type.name());
        assertEquals(null, gameResult.survivingMembersOfLosingTeam);
    }

    @Test
    void test_battle_with_tie_transformers() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE); // 31
        Transformer testTransformer = TestDataFactory.fixture(FixtureName.TEST); // 31

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundwave);
        transformers.add(testTransformer);
        GameResult gameResult = game.fight(transformers);

        assertEquals(1, gameResult.numberOfBattles);
        assertEquals(null, gameResult.winningTeam);
        assertEquals(null, gameResult.survivingMembersOfLosingTeam);
    }
}