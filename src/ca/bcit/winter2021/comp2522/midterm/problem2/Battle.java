package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;


public class Battle {
    private TransformersSorter sorter = new TransformersSorter();
    private int buttleCount = 0;
    private int deceptionWonCount = 0;
    private int autobotWonCount = 0;

    public GameResult fight(ArrayList<Transformer> transformers) {
        ArrayList<Transformer> deceptionTransformers = deceptionTransformers(transformers);
        ArrayList<Transformer> autobotTransformers = autobotTransformers(transformers);
        int maxBattleCount = Math.min(deceptionTransformers.size(), autobotTransformers.size());

        ArrayList<Transformer> sortedDeceptionTransformers = sorter.sort(deceptionTransformers);
        ArrayList<Transformer> sortedAutobotTransformers = sorter.sort(autobotTransformers);

        ArrayList<Transformer> immutableSortedDeceptionTransformers = new ArrayList<Transformer>(sortedDeceptionTransformers);
        ArrayList<Transformer> immutableSortedAutobotTransformers = new ArrayList<Transformer>(sortedAutobotTransformers);

        int index = 0;
        while(!(buttleCount >= maxBattleCount)){
            BattleRules rules = new BattleRules(
                    immutableSortedDeceptionTransformers.get(index),
                    immutableSortedAutobotTransformers.get(index)
            );

            BattleResult battleResult = rules.buttle();
            switch (battleResult) {
                case BOTH_DESTROYED:
                    buttleCount += 1;
                    deceptionWonCount += 1;
                    autobotWonCount += 1;
                    sortedDeceptionTransformers.remove(index);
                    sortedAutobotTransformers.remove(index);
                    break;

                case DECEPTION_SPECIAL_WIN:
                    buttleCount += 1;
                    return new GameResult(
                            buttleCount,
                            immutableSortedDeceptionTransformers.get(0),
                            null
                    );

                case DECEPTION_WIN:
                    deceptionWonCount += 1;
                    buttleCount += 1;
                    sortedAutobotTransformers.remove(index);
                    break;

                case AUTOBOT_SPECIAL_WIN:
                    buttleCount += 1;
                    return new GameResult(
                            buttleCount,
                            immutableSortedAutobotTransformers.get(0),
                            null
                    );

                case AUTOBOT_WIN:
                    autobotWonCount += 1;
                    buttleCount += 1;
                    sortedDeceptionTransformers.remove(index);
                    break;

                default:
                    System.out.println(">>> Error");
                    break;
            }

            index++;
        }

        if(autobotWonCount == deceptionWonCount) {
            return  new GameResult(
                    buttleCount,
                    null,
                    null
            );
        } else if(autobotWonCount > deceptionWonCount) {
            if(sortedDeceptionTransformers.isEmpty()) {
                return  new GameResult(
                        buttleCount,
                        immutableSortedAutobotTransformers.get(0),
                        null
                );
            } else {
                return  new GameResult(
                        buttleCount,
                        immutableSortedAutobotTransformers.get(0),
                        sortedDeceptionTransformers.get(0)
                );
            }
        } else {
            if(sortedAutobotTransformers.isEmpty()) {
                return  new GameResult(
                        buttleCount,
                        null,
                        sortedAutobotTransformers.get(0)
                );
            } else {
                return  new GameResult(
                        buttleCount,
                        immutableSortedDeceptionTransformers.get(0),
                        sortedAutobotTransformers.get(0)
                );
            }
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
