package ca.bcit.winter2021.comp2522.midterm.problem2;

public class OutputFormatter {

    public String formatNumberOfBattles(GameResult gameResult) {
        String numberString = String.valueOf(gameResult.numberOfBattles);
        return String.format("The number of battles: %s", numberString);
    }

    public String formatWinningTeam(GameResult gameResult) {
        if(gameResult.winningTeam == null) {
            return "The winning team: ";
        } else {
            String teamName = gameResult.winningTeam.type.outPutTeamName();
            String firstTransformerName = gameResult.winningTeam.name;
            return String.format("The winning team: (%s): %s", teamName, firstTransformerName);
        }
    }

    public String formatSurvivingMembersOfLosingTeam(GameResult gameResult) {
        if(gameResult.survivingMembersOfLosingTeam == null) {
            return "The surviving members of the losing team: ";
        } else {
            String survivingMembersOfLosingTeamString = "";
            for (Transformer transformer : gameResult.survivingMembersOfLosingTeam) {
                survivingMembersOfLosingTeamString = survivingMembersOfLosingTeamString + " " + transformer.name;
            }
            String teamName = gameResult.survivingMembersOfLosingTeam.get(0).type.outPutTeamName();
            return String.format("The surviving members of the losing team: (%s):%s", teamName, survivingMembersOfLosingTeamString);
        }
    }
}

