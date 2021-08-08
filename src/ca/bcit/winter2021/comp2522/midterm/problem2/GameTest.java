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

    @Test
    void test_dataFile_secondBattle() {
        Transformer soundWave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer razorclaw = TestDataFactory.fixture(FixtureName.RAZORCLAW);
        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(soundWave);
        transformers.add(razorclaw);
        transformers.add(optimusPrime);

        game.start(transformers);

        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: (Autobots): Optimus Prime";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        assertEquals(expectedNumberOfBattles, game.formatedNumberOfBattles);
        assertEquals(expectedWinningTeam, game.formatedWinningTeam);
        assertEquals(expectedSurvivingMembersOfLosingTeam, game.formatedSurvivingMembersOfLosingTeam);
    }

    @Test
    void test_dataFile_thirdBattle() {
        ArrayList<Transformer> transformers = new ArrayList<>();

        Transformer divebomb = TestDataFactory.fixture(FixtureName.DIVEBOMB);
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        Transformer cutthroat = TestDataFactory.fixture(FixtureName.CUTTHROAT);
        Transformer headstrong = TestDataFactory.fixture(FixtureName.HEADSTRONG);
        Transformer kickback = TestDataFactory.fixture(FixtureName.KICKBACK);
        Transformer skydive = TestDataFactory.fixture(FixtureName.SKYDIVE);
        Transformer megatron = TestDataFactory.fixture(FixtureName.MEGATRON);
        transformers.add(divebomb);
        transformers.add(predaking);
        transformers.add(cutthroat);
        transformers.add(headstrong);
        transformers.add(kickback);
        transformers.add(skydive);
        transformers.add(megatron);

        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);
        Transformer blaster = TestDataFactory.fixture(FixtureName.BLASTER);
        Transformer sandstorm = TestDataFactory.fixture(FixtureName.SANDSTORM);
        Transformer repugnus = TestDataFactory.fixture(FixtureName.REPUGNUS);
        Transformer gears = TestDataFactory.fixture(FixtureName.GEARS);
        Transformer hardhead = TestDataFactory.fixture(FixtureName.HARDHEAD);
        Transformer doublecross = TestDataFactory.fixture(FixtureName.DOUBLECROSS);
        transformers.add(bluestreak);
        transformers.add(hubcap);
        transformers.add(blaster);
        transformers.add(sandstorm);
        transformers.add(repugnus);
        transformers.add(gears);
        transformers.add(hardhead);
        transformers.add(doublecross);

        game.start(transformers);

        String expectedNumberOfBattles = "The number of battles: 5";
        String expectedWinningTeam = "The winning team: (Deceptions): Divebomb";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        assertEquals(expectedNumberOfBattles, game.formatedNumberOfBattles);
        assertEquals(expectedWinningTeam, game.formatedWinningTeam);
        assertEquals(expectedSurvivingMembersOfLosingTeam, game.formatedSurvivingMembersOfLosingTeam);
    }

    @Test
    void test_dataFile_forthBattle() {
        ArrayList<Transformer> transformers = new ArrayList<>();

        Transformer razorclaw = TestDataFactory.fixture(FixtureName.RAZORCLAW); // rank: 7
        Transformer barrage = TestDataFactory.fixture(FixtureName.BARRAGE); // rank: 9
        transformers.add(razorclaw);
        transformers.add(barrage);

        Transformer computron = TestDataFactory.fixture(FixtureName.COMPUTRON); // rank: 9
        Transformer freeway = TestDataFactory.fixture(FixtureName.FREEWAY); // rank: 2
        transformers.add(computron);
        transformers.add(freeway);

        game.start(transformers);

        String expectedNumberOfBattles = "The number of battles: 2";
        String expectedWinningTeam = "The winning team: ";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        assertEquals(expectedNumberOfBattles, game.formatedNumberOfBattles);
        assertEquals(expectedWinningTeam, game.formatedWinningTeam);
        assertEquals(expectedSurvivingMembersOfLosingTeam, game.formatedSurvivingMembersOfLosingTeam);
    }
}