package ca.bcit.winter2021.comp2522.midterm.problem2;

// FIXME: If transformers are limited, they should be used by enum actually
public class TransformersTeam {
    public String name;
    public TransformersType type;
    public int strength;
    public int intelligence;
    public int speed;
    public int endurance;
    public int rank;
    public int courage;
    public int firepower;
    public int skill;

    public TransformersTeam(String name,
                            TransformersType type,
                            int strength,
                            int intelligence,
                            int speed,
                            int endurance,
                            int rank,
                            int courage,
                            int firepower,
                            int skill) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;
    }
}