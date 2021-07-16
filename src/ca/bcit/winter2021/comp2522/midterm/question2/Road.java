package ca.bcit.winter2021.comp2522.midterm.question2;

public class Road {

    //TODO: define proper instance variables if needed
    private String cityName;
    private int distance;

    //TODO: define a constructor(s)
    public Road(String cityName, int distance){
        this.cityName = cityName;
        this.distance = distance;
    }

    //TODO: Add proper methods if needed
    public String getCityName() {return cityName;}
    public int getDistance() {return distance;}
}
