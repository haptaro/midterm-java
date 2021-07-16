package ca.bcit.winter2021.comp2522.midterm.question2;

import java.util.ArrayList;
import java.util.Collections;

public class BiggestDistanceCalculator {
    public Road getBiggestDistance(ArrayList<Road> roads){
        Collections.sort(roads);
        return roads.get(1);
    }
}
