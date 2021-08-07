package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputFormatterTest {
    private OutputFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new OutputFormatter();
    }

    @Test
    void test_format_one() {
        // I don't know the winning team output from the description
        // I implemented below that show only 1 transformer
        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: (Deceptions): Soundwave";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: (Autobots): Hubcap";

        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);

        GameResult result = new GameResult(
                1,
                soundwave,
                hubcap
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }

    @Test
    void test_format_two() {
        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: (Deceptions): Soundwave";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);

        GameResult result = new GameResult(
                1,
                soundwave,
                null
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }

    @Test
    void test_format_three() {
        String expectedNumberOfBattles = "The number of battles: 2";
        String expectedWinningTeam = "The winning team: (Deceptions): Predaking";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);

        GameResult result = new GameResult(
                2,
                predaking,
                null
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }

    @Test
    void test_format_four() {
        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: (Autobots): Optimus Prime";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);

        GameResult result = new GameResult(
                1,
                optimusPrime,
                null
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }

    @Test
    void test_format_five() {
        String expectedNumberOfBattles = "The number of battles: 2";
        String expectedWinningTeam = "The winning team: (Autobots): Computron";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: (Deceptions): Barrage";

        Transformer barrage = TestDataFactory.fixture(FixtureName.BARRAGE);
        Transformer computron = TestDataFactory.fixture(FixtureName.COMPUTRON);

        GameResult result = new GameResult(
                2,
                computron,
                barrage
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }

    @Test
    void test_format_six_for_tie() {
        String expectedNumberOfBattles = "The number of battles: 1";
        String expectedWinningTeam = "The winning team: ";
        String expectedSurvivingMembersOfLosingTeam = "The surviving members of the losing team: ";

        GameResult result = new GameResult(
                1,
                null,
                null
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }
}