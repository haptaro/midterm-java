package ca.bcit.winter2021.comp2522.midterm.question2;

import java.util.ArrayList;

public class Road implements Comparable<Road> {

    private String city1;
    private String city2;
    private double distance;
    private ArrayList<Road> roads;


    public Road(String city1, String city2, double distance){
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
    }

    public String getCity1Name(){
        return city1;
    }

    public String getCity2Name(){
        return city2;
    }

    public double getDistance(){
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

    @Override
    public int compareTo(Road r) {
        if(this.distance==r.getDistance()){
            return 0;
        } else if(this.distance < r.getDistance()){
            //return -1;
            return 1;
        } else {
            //return 1;
            return -1;
        }
    }
}
