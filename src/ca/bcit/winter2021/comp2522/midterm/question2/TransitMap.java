package ca.bcit.winter2021.comp2522.midterm.question2;

import java.util.ArrayList;

public class TransitMap {
    private ArrayList<Road> roads = new ArrayList<>();
    private  int distance;


    public void addRoad(Road road){
        this.roads.add(road);
    }


    public int getDistance() {
        return distance;
    }

    public ArrayList<Double> getDistances(String cityName){
        ArrayList<Double> distances = new ArrayList<>();
        for (Road road: roads){
            if(road.getCity1Name().equals(cityName) || road.getCity2Name().equals(cityName)){
                distances.add(road.getDistance());
            }
        }

        return distances;
    }

    public ArrayList<Road> getRoads(){
        return this.roads;
    }
}
