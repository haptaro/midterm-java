package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;


public class Game {

    public Result fight(ArrayList<Transformer> transformers) {
        BattleRules rules = new BattleRules(
                deceptionTransformers(transformers).get(0),
                autobotTransformers(transformers).get(0)
        );
        return rules.buttle();
    }

    // TODO: I want to use filter of stream
    private ArrayList<Transformer> deceptionTransformers(ArrayList<Transformer> transformers) {
        ArrayList<Transformer> deceptionTransformers = new ArrayList<>();
        for(int i = 0; i < transformers.size(); i++)
        {
            if(transformers.get(i).type == TransformersType.DECEPTION) {
                deceptionTransformers.add(transformers.get(i));
            }
        }
        return deceptionTransformers;
    }

    private ArrayList<Transformer> autobotTransformers(ArrayList<Transformer> transformers) {
        ArrayList<Transformer> autobotTransformers = new ArrayList<>();
        for(int i = 0; i < transformers.size(); i++)
        {
            if(transformers.get(i).type == TransformersType.AUTOBOT) {
                autobotTransformers.add(transformers.get(i));
            }
        }
        return  autobotTransformers;
    }
}
