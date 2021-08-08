package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleRulesTest {

    @Test
    void test_buttle_predaking_win_predaking() {
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);

        BattleRules rules = new BattleRules(
                predaking,
                bluestreak
        );

        assertEquals(BattleResult.DECEPTION_SPECIAL_WIN, rules.buttle());
    }

    @Test
    void test_buttle_tie_both_destroyed() {
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);

        BattleRules rules = new BattleRules(
                predaking,
                optimusPrime
        );

        assertEquals(BattleResult.BOTH_DESTROYED, rules.buttle());
    }

    @Test
    void test_buttle_optimusPrime_win_optimusPrime() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer optimusPrime = TestDataFactory.fixture(FixtureName.OPTIMUSPRIME);

        BattleRules rules = new BattleRules(
                soundwave,
                optimusPrime
        );

        assertEquals(BattleResult.AUTOBOT_SPECIAL_WIN, rules.buttle());
    }

    @Test
    void test_buttle_same_overall_rating_should_both_destroyed() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer test = TestDataFactory.fixture(FixtureName.TEST);

        BattleRules rules = new BattleRules(
                soundwave,
                test
        );

        assertEquals(BattleResult.BOTH_DESTROYED, rules.buttle());
    }

    @Test
    void test_normal_buttule() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer rewind = TestDataFactory.fixture(FixtureName.REWIND);

        BattleRules rules = new BattleRules(
                soundwave,
                rewind
        );

        assertEquals(BattleResult.DECEPTION_WIN, rules.buttle());
    }

    @Test
    void test_buttle_4_more_courage_points_and_3_more_strength_points_regardress_of_overall_rating() {
        // courage: 1, strength: 1, overallRating: 35
        Transformer test1 = TestDataFactory.fixture(FixtureName.TEST1);
        // courage: 10, strength: 10, overallRating: 16
        Transformer test2 = TestDataFactory.fixture(FixtureName.TEST2);

        BattleRules rules = new BattleRules(
                test1,
                test2
        );

        assertEquals(BattleResult.AUTOBOT_WIN, rules.buttle());
    }

    @Test
    void test_buttle_4_more_skill_above_should_win_regardress_of_overall_rating() {
        // skill: 10, overallRating:5
        Transformer test3 = TestDataFactory.fixture(FixtureName.TEST3);
        System.out.println(test3.overallRating());
        // skill: 1, overallRating: 50
        Transformer test4 = TestDataFactory.fixture(FixtureName.TEST4);
        System.out.println(test4.overallRating());

        BattleRules rules = new BattleRules(
                test3,
                test4
        );

        assertEquals(BattleResult.DECEPTION_WIN, rules.buttle());
    }
}
