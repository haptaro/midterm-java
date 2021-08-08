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
    void test_normal_battule() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        Transformer rewind = TestDataFactory.fixture(FixtureName.REWIND);

        BattleRules rules = new BattleRules(
                soundwave,
                rewind
        );

        assertEquals(BattleResult.DECEPTION_WIN, rules.buttle());
    }
}