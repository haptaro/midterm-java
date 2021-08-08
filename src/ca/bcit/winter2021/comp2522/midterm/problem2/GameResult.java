package ca.bcit.winter2021.comp2522.midterm.problem2;

public class GameResult {
    public int numberOfBattles;
    public Transformer winningTeam; // This field is nullable(for tie)
    public Transformer survivingMembersOfLosingTeam; // This field is nullable

    public GameResult(int numberOfBattles, Transformer winningTeam, Transformer survivingMembersOfLosingTeam) {
        this.numberOfBattles = numberOfBattles;
        this.winningTeam = winningTeam;
        this.survivingMembersOfLosingTeam = survivingMembersOfLosingTeam;
    }
}