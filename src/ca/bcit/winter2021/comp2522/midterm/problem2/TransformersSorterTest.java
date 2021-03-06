package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TransformersSorterTest {
    // If sort key is the same, what should I do? I don't know send sort key
    // I don't know sorting, like ascending, descending
    // I decided ascending
    private  TransformersSorter sorter;
    @BeforeEach
    void setUp() {
        sorter = new TransformersSorter();
    }

    @Test
    void test_sort_one() {
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, bluestreak.name);
    }

    @Test
    void test_sort_two() {
    Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
    Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        transformers.add(hubcap);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, hubcap.name);
        assertEquals(transformers.get(1).name, bluestreak.name);
    }

    @Test
    void test_sort_three() {
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK);
        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP);
        Transformer rewind = TestDataFactory.fixture(FixtureName.REWIND);

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        transformers.add(hubcap);
        transformers.add(rewind);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, hubcap.name);
        assertEquals(transformers.get(1).name, bluestreak.name);
        assertEquals(transformers.get(2).name, rewind.name);
    }

    @Test
    void test_sort_four() {
        Transformer bluestreak = TestDataFactory.fixture(FixtureName.BLUESTREAK); // rank: 5
        Transformer hubcap = TestDataFactory.fixture(FixtureName.HUBCAP); // rank: 4
        Transformer rewind = TestDataFactory.fixture(FixtureName.REWIND); // rank: 6
        Transformer grimlock = TestDataFactory.fixture(FixtureName.GRIMLOCK); // rank: 9

        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        transformers.add(hubcap);
        transformers.add(rewind);
        transformers.add(grimlock);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, hubcap.name);
        assertEquals(transformers.get(1).name, bluestreak.name);
        assertEquals(transformers.get(2).name, rewind.name);
        assertEquals(transformers.get(3).name, grimlock.name);
    }

    @Test
    void test_sort_five() {
        ArrayList<Transformer> transformers = new ArrayList<>();

        Transformer divebomb = TestDataFactory.fixture(FixtureName.DIVEBOMB); // rank: 3
        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING); // rank: 7
        Transformer cutthroat = TestDataFactory.fixture(FixtureName.CUTTHROAT); // rank: 8
        Transformer headstrong = TestDataFactory.fixture(FixtureName.HEADSTRONG); // rank: 6
        Transformer kickback = TestDataFactory.fixture(FixtureName.KICKBACK); // rank: 6
        Transformer skydive = TestDataFactory.fixture(FixtureName.SKYDIVE); // rank: 5
        Transformer megatron = TestDataFactory.fixture(FixtureName.MEGATRON); // rank: 7
        transformers.add(divebomb);
        transformers.add(predaking);
        transformers.add(cutthroat);
        transformers.add(headstrong);
        transformers.add(kickback);
        transformers.add(skydive);
        transformers.add(megatron);

        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, divebomb.name);
        assertEquals(transformers.get(1).name, skydive.name);
        assertEquals(transformers.get(2).name, headstrong.name);
        assertEquals(transformers.get(3).name, kickback.name);
        assertEquals(transformers.get(4).name, predaking.name);
        assertEquals(transformers.get(5).name, megatron.name);
        assertEquals(transformers.get(6).name, cutthroat.name);
    }

    @Test
    void test_sort_six() {
        ArrayList<Transformer> transformers = new ArrayList<>();

        Transformer predaking = TestDataFactory.fixture(FixtureName.PREDAKING); // rank: 7
        Transformer cliffjumper = TestDataFactory.fixture(FixtureName.CLIFFJUMPER); // rank: 9
        Transformer soundWave = TestDataFactory.fixture(FixtureName.SOUNDWAVE); // rank: 7
        Transformer kickback = TestDataFactory.fixture(FixtureName.KICKBACK); // rank: 6
        transformers.add(predaking);
        transformers.add(cliffjumper);
        transformers.add(soundWave);
        transformers.add(kickback);

        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, kickback.name);
        assertEquals(transformers.get(1).name, predaking.name);
        assertEquals(transformers.get(2).name, soundWave.name);
        assertEquals(transformers.get(3).name, cliffjumper.name);
    }
}