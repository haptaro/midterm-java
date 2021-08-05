package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;
import java.util.Collections;

public class TransformersSorter {
    // TODO: It's possible Stream#filter as well
    public ArrayList<TransformersTeam> sort(ArrayList<TransformersTeam> transformers) {
        Collections.sort(transformers);
        return transformers;
    }
}

