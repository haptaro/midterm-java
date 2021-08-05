package ca.bcit.winter2021.comp2522.midterm.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TransformersSorterTest {
    // FIXME: If sort key is the same, what should I do?
    private  TransformersSorter sorter;
    @BeforeEach
    void setUp() {
        sorter = new TransformersSorter();
    }

    @Test
    void test_sort_one() {
        TransformersTeam bluestreak = new TransformersTeam(
                "Bluestreak",
                TransformersType.AUTOBOT,
                6,
                6,
                7,
                9,
                5,
                2,
                9,
                7
        );
        ArrayList<TransformersTeam> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, bluestreak.name);
    }

    @Test
    void test_sort_two() {
    TransformersTeam bluestreak = new TransformersTeam(
            "Bluestreak",
            TransformersType.AUTOBOT,
            6,
            6,
            7,
            9,
            5,
            2,
            9,
            7
    );
    TransformersTeam hubcap = new TransformersTeam(
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
        ArrayList<TransformersTeam> transformers = new ArrayList<>();
        transformers.add(bluestreak);
        transformers.add(hubcap);
        sorter.sort(transformers);

        assertEquals(transformers.get(0).name, hubcap.name);
        assertEquals(transformers.get(1).name, bluestreak.name);
    }

    @Test
    void test_sort_three() {
        TransformersTeam bluestreak = new TransformersTeam(
                "Bluestreak",
                TransformersType.AUTOBOT,
                6,
                6,
                7,
                9,
                5,
                2,
                9,
                7
        );
        TransformersTeam hubcap = new TransformersTeam(
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
        TransformersTeam rewind = new TransformersTeam(
                "Rewind",
                TransformersType.AUTOBOT,
                4,
                9,
                2,
                7,
                6,
                7,
                4,
                8
        );
        ArrayList<TransformersTeam> transformers = new ArrayList<>();
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
        TransformersTeam bluestreak = new TransformersTeam(
                "Bluestreak",
                TransformersType.AUTOBOT,
                6,
                6,
                7,
                9,
                5,
                2,
                9,
                7
        );
        TransformersTeam hubcap = new TransformersTeam(
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
        TransformersTeam rewind = new TransformersTeam(
                "Rewind",
                TransformersType.AUTOBOT,
                4,
                9,
                2,
                7,
                6,
                7,
                4,
                8
        );
        TransformersTeam grimlock = new TransformersTeam(
                "Grimlock",
                TransformersType.AUTOBOT,
                10,
                7,
                3,
                10,
                9,
                10,
                8,
                10
        );
        ArrayList<TransformersTeam> transformers = new ArrayList<>();
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