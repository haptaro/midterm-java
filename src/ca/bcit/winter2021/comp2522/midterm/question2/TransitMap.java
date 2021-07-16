package ca.bcit.winter2021.comp2522.midterm.question2;

import java.util.ArrayList;

public class TransitMap {
    //TODO: define proper instance variables if needed
    private ArrayList<Road> roads;
    private  int distance;

    //TODO: define a constructor(s)

    public TransitMap() {
    }


    //TODO: Add proper methods if needed

    public int getDistance() {
        return distance;
    }
    public Road getBiggestDistance(){
        int maxDistance = 0;
        Road longestDistance = null;

        for(Road road: roads){
            if(road.getDistance()>maxDistance){
                maxDistance = road.getDistance();
                longestDistance = road;
            }
        }
        return longestDistance;
    }

}
