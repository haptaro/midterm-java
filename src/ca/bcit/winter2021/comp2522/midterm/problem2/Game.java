package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;

public class Game {
    public String formatedNumberOfBattles;
    public String formatedWinningTeam;
    public String formatedSurvivingMembersOfLosingTeam;

    private Battle battle = new Battle();
    private OutputFormatter formatter = new OutputFormatter();

    public void start(ArrayList<Transformer> transformers) {
        GameResult result = battle.fight(transformers);

        formatedNumberOfBattles = formatter.formatNumberOfBattles(result);
        formatedWinningTeam = formatter.formatWinningTeam(result);
        formatedSurvivingMembersOfLosingTeam = formatter.formatSurvivingMembersOfLosingTeam(result);
    }
}
