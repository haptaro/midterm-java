package ca.bcit.winter2021.comp2522.midterm.question3;

import java.util.Comparator;

public class FollowerSorter implements Comparator<TwitterAccount> {
    @Override
    public int compare(TwitterAccount o1, TwitterAccount o2) {
        if(o1.getFollowings()==o2.getFollowings()){
            return 0;
        } else if (o1.getFollowings()<o2.getFollowings()){
            return -1;
        } else {
            return 1;
        }
    }
}
