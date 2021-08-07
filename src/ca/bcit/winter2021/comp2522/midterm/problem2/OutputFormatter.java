package ca.bcit.winter2021.comp2522.midterm.problem2;

public class OutputFormatter {

    public String formatNumberOfBattles(GameResult gameResult) {
        String numberString = String.valueOf(gameResult.numberOfBattles);
        return String.format("The number of battles: %s", numberString);
    }

    public String formatWinningTeam(GameResult gameResult) {
        String teamName = gameResult.winningTeam.type.outPutTeamName();
        String firstTransformerName = gameResult.winningTeam.name;
        return String.format("The winning team: (%s): %s", teamName, firstTransformerName);
    }

    public String formatSurvivingMembersOfLosingTeam(GameResult gameResult) {
        if(gameResult.survivingMembersOfLosingTeam == null) {
            return "The surviving members of the losing team: ";
        } else {
            String teamName = gameResult.survivingMembersOfLosingTeam.type.outPutTeamName();
            String firstTransformerName = gameResult.survivingMembersOfLosingTeam.name;
            return String.format("The surviving members of the losing team: (%s): %s", teamName, firstTransformerName);
        }
    }
}

