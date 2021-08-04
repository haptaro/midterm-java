package ca.bcit.winter2021.comp2522.midterm.problem2;

public class Result {
    public int numberOfBattles;
    public String winningTeam; // FIXME: Should be enum
    public String survivingMembersOfLosingTeam;

    public Result(int numberOfBattles, String winningTeam, String survivingMembersOfLosingTeam) {
        this.numberOfBattles = numberOfBattles;
        this.winningTeam = winningTeam;
        this.survivingMembersOfLosingTeam = survivingMembersOfLosingTeam;
    }
}