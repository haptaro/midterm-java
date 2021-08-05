package ca.bcit.winter2021.comp2522.midterm.problem2;

public class BattleRules {
    private TransformersTeam deceptionTransformer;
    private TransformersTeam autobotTransformer;

    public BattleRules(TransformersTeam deceptionTransformer, TransformersTeam autobotTransformer) {
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
        } else {
            return new Result(
                    1,
                    "Soundwave",
                    "Hubcap"
            );
        }
    }
}
