package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;
import java.util.Collections;

public class TransformersSorter {
    // TODO: It's possible Stream#filter as well
    public ArrayList<Transformer> sort(ArrayList<Transformer> transformers) {
        Collections.sort(transformers);
        return transformers;
    }
}

