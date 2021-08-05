package ca.bcit.winter2021.comp2522.midterm.problem2;

public class BattleRules {
    private Transformer deceptionTransformer;
    private Transformer autobotTransformer;

    public BattleRules(Transformer deceptionTransformer, Transformer autobotTransformer) {
        this.deceptionTransformer = deceptionTransformer;
        this.autobotTransformer = autobotTransformer;
    }

    public Result buttle() {
        if (autobotTransformer.name == "Optimus Prime") {
            return new Result(
                    1,
                    "Optimus Prime",
                    ""
            );
        }

        if(deceptionTransformer.name == "Predaking") {
            return new Result(
                    1,
                    "Predaking",
                    ""
            );
        }
        return new Result(
                1,
                "Soundwave",
                "Hubcap"
        );
    }
}
