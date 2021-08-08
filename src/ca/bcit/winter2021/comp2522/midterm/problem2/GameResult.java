package ca.bcit.winter2021.comp2522.midterm.problem2;

import java.util.ArrayList;

public class GameResult {
    public int numberOfBattles;
    public Transformer winningTeam; // This field is nullable(for tie)
    public ArrayList<Transformer> survivingMembersOfLosingTeam; // This field is nullable

    public GameResult(int numberOfBattles, Transformer winningTeam, ArrayList<Transformer> survivingMembersOfLosingTeam) {
        this.numberOfBattles = numberOfBattles;
        this.winningTeam = winningTeam;
        this.survivingMembersOfLosingTeam = survivingMembersOfLosingTeam;
    }
}