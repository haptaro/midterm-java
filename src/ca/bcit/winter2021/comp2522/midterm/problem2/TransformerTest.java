package ca.bcit.winter2021.comp2522.midterm.problem2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    @Test
    void test_overallRatings() {
        Transformer soundwave = TestDataFactory.fixture(FixtureName.SOUNDWAVE);
        assertEquals(31, soundwave.overallRating());

        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
        assertEquals(37, bluestreak.overallRating());

        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);
        assertEquals(20, hubcap.overallRating());

        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING);
        assertEquals(32, predaking.overallRating());
    }
}