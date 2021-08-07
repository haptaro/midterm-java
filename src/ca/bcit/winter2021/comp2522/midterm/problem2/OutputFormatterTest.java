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


//        Transformer razorclaw = new Transformer(
//                "Razorclaw",
//                TransformersType.DECEPTION,
//                4,
//                5,
//                3,
//                6,
//                7,
//                2,
//                6,
//                10
//        );

        Transformer barrage = new Transformer(
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

        Transformer computron = new Transformer(
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

//        Transformer freeway = new Transformer(
//                "Freeway",
//                TransformersType.AUTOBOT,
//                3,
//                3,
//                9,
//                9,
//                2,
//                2,
//                7,
//                8
//        );

        GameResult result = new GameResult(
                2,
                computron,
                barrage
        );

        assertEquals(expectedNumberOfBattles, formatter.formatNumberOfBattles(result));
        assertEquals(expectedWinningTeam, formatter.formatWinningTeam(result));
        assertEquals(expectedSurvivingMembersOfLosingTeam, formatter.formatSurvivingMembersOfLosingTeam(result));
    }
}