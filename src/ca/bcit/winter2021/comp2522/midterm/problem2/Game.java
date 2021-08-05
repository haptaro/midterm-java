package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;
import java.util.Arrays;


public class Game {

    public Result fight(ArrayList<TransformersTeam> transformers) {
        BattleRules rules = new BattleRules(
                deceptionTransformers(transformers).get(0),
                autobotTransformers(transformers).get(0)
        );
        return rules.buttle();
    }

    // TODO: I want to use filter of stream
    private ArrayList<TransformersTeam> deceptionTransformers(ArrayList<TransformersTeam> transformers) {
        ArrayList<TransformersTeam> deceptionTransformers = new ArrayList<>();
        for(int i = 0; i < transformers.size(); i++)
        {
            if(transformers.get(i).type == TransformersType.DECEPTION) {
                deceptionTransformers.add(transformers.get(i));
            }
        }
        return deceptionTransformers;
    }

    private ArrayList<TransformersTeam> autobotTransformers(ArrayList<TransformersTeam> transformers) {
        ArrayList<TransformersTeam> autobotTransformers = new ArrayList<>();
        for(int i = 0; i < transformers.size(); i++)
        {
            if(transformers.get(i).type == TransformersType.AUTOBOT) {
                autobotTransformers.add(transformers.get(i));
            }
        }
        return  autobotTransformers;
    }
}
