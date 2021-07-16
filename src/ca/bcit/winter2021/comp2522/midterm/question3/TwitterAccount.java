package ca.bcit.winter2021.comp2522.midterm.question3;

public class TwitterAccount {

    private String tID;
    private int followers;
    private int following;
    private int joinedYear;

    public TwitterAccount(String tID, int followers, int following, int joinedYear) {
        this.tID = tID;
        this.followers = followers;
        this.following = following;
        this.joinedYear = joinedYear;
    }

    public int getFollowers(){
        return this.followers;
    }
    public int getFollowings(){ return this.following; }
}
