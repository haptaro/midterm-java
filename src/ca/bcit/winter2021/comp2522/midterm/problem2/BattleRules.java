package ca.bcit.winter2021.comp2522.midterm.problem2;

public class BattleRules {
    private Transformer deceptionTransformer;
    private Transformer autobotTransformer;

    public BattleRules(Transformer deceptionTransformer, Transformer autobotTransformer) {
        this.deceptionTransformer = deceptionTransformer;
        this.autobotTransformer = autobotTransformer;
    }

    public BattleResult battle() {
        if (autobotTransformer.name == "Optimus Prime" && deceptionTransformer.name == "Predaking") {
            return BattleResult.BOTH_DESTROYED;
        }

        if (autobotTransformer.name == "Optimus Prime") {
            return BattleResult.AUTOBOT_SPECIAL_WIN;
        }

        if(deceptionTransformer.name == "Predaking") {
            return BattleResult.DECEPTION_SPECIAL_WIN;
        }

        if(autobotTransformer.courage >= deceptionTransformer.courage + 4 && autobotTransformer.strength >= deceptionTransformer.strength + 3) {
            return BattleResult.AUTOBOT_WIN;
        }

        if(deceptionTransformer.courage >= autobotTransformer.courage + 4 && deceptionTransformer.strength >= autobotTransformer.strength + 3) {
            return  BattleResult.DECEPTION_WIN;
        }

        if(autobotTransformer.skill >= deceptionTransformer.skill + 3) {
            return  BattleResult.AUTOBOT_WIN;
        }

        if(deceptionTransformer.skill >= autobotTransformer.skill + 3) {
            return  BattleResult.DECEPTION_WIN;
        }

        if(autobotTransformer.overallRating() == deceptionTransformer.overallRating()) {
            return BattleResult.BOTH_DESTROYED;
        } else if(autobotTransformer.overallRating() > deceptionTransformer.overallRating()) {
            return BattleResult.AUTOBOT_WIN;
        } else {
            return BattleResult.DECEPTION_WIN;
        }
    }
}
