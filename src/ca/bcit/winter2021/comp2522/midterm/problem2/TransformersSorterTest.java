package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TransformersSorterTest {
    // FIXME: If sort key is the same, what should I do?
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
}