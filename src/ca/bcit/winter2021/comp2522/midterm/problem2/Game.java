package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;


public class Game {
    private TransformersSorter sorter = new TransformersSorter();
    private int buttleCount = 1;
    private int deceptionWonCount = 0;
    private int autobotWonCount = 0;

    public GameResult fight(ArrayList<Transformer> transformers) {
        ArrayList<Transformer> deceptionTransformers = deceptionTransformers(transformers);
        ArrayList<Transformer> autobotTransformers = autobotTransformers(transformers);

        ArrayList<Transformer> sortedDeceptionTransformers = sorter.sort(deceptionTransformers);
        ArrayList<Transformer> sortedAutobotTransformers = sorter.sort(autobotTransformers);

        boolean isContinue = sortedAutobotTransformers.isEmpty() || sortedDeceptionTransformers.isEmpty();
        int index = 0;

        while(isContinue){
            BattleRules rules = new BattleRules(
                    sortedDeceptionTransformers.get(index),
                    sortedAutobotTransformers.get(index)
            );


            BattleResult battleResult = rules.buttle();
            switch (battleResult) {
                case BOTH_DESTROYED:
                    deceptionWonCount += 1;
                    autobotWonCount += 1;
                    sortedDeceptionTransformers.remove(index);
                    sortedAutobotTransformers.remove(index);
                    break;

                case DECEPTION_SPECIAL_WIN:
                    return new GameResult(
                            buttleCount,
                            sortedDeceptionTransformers.get(0),
                            null
                    );

                case DECEPTION_WIN:
                    deceptionWonCount += 1;
                    sortedAutobotTransformers.remove(index);
                    break;

                case AUTOBOT_SPECIAL_WIN:
                    return new GameResult(
                            buttleCount,
                            sortedAutobotTransformers.get(0),
                            null
                    );

                case AUTOBOT_WIN:
                    autobotWonCount += 1;
                    sortedDeceptionTransformers.remove(index);
                    break;

                default:
                    System.out.println(">>> Error");
                    break;
            }

            buttleCount += 1;
            index++;
        }

        if(autobotWonCount > deceptionWonCount) {
            return  new GameResult(
                    buttleCount,
                    sortedAutobotTransformers.get(0),
                    sortedDeceptionTransformers.get(0)
            );
        } else {
            return  new GameResult(
                    buttleCount,
                    sortedDeceptionTransformers.get(0),
                    sortedAutobotTransformers.get(0)
            );
        }
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
