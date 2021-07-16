package ca.bcit.winter2021.comp2522.midterm.question2;

import java.util.Collections;

public class TestQuestion2 {
    public static void runAllTestScenariosForQuestion2(){

        //Note: Do not make changes to the following statement
        //Note: Do not make changes to the following statement
        TransitMap tm = new TransitMap();

        final String CHICAGO = "Chicago";
        final String DETROIT = "Detroit";
        final String BOSTON = "Boston";
        final String NEWYORK = "New York";
        final String PHILADELPHIA = "Philadelphia";

        Road road1 = new Road(CHICAGO, DETROIT, 237.053);
        Road road2 = new Road(CHICAGO, NEWYORK, 710.849);
        Road road3 = new Road(PHILADELPHIA, DETROIT, 663.624);

        Road road4 = new Road(DETROIT, BOSTON, 611.554);
        Road road5 = new Road(DETROIT, DETROIT, 480.506);

        Road road6 = new Road(BOSTON, DETROIT, 611.554);
        Road road7 = new Road(BOSTON, NEWYORK, 190.015);
        Road road8 = new Road(BOSTON, PHILADELPHIA, 270.545);


        Road road9 = new Road(NEWYORK, BOSTON, 190.015);
        Road road10 = new Road(NEWYORK, DETROIT, 480.506);
        Road road11 = new Road(NEWYORK, CHICAGO, 710.849);
        Road road12 = new Road(NEWYORK, PHILADELPHIA, 80.592);

        Road road13 = new Road(PHILADELPHIA, BOSTON, 270.545);
        Road road14 = new Road(PHILADELPHIA, NEWYORK, 80.592);
        Road road15 = new Road(PHILADELPHIA, CHICAGO, 663.624);
        Road road16 = new Road(PHILADELPHIA, DETROIT, 441.609);


        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements
        testGetDistance(tm, "Boston");
        testGetBiggestDistance(tm);
        testSortTransitMap(tm);
    }

    private static void testGetDistance(TransitMap tm, String cityName){
        tm.getDistances(cityName);
    }

    private static void testGetBiggestDistance(TransitMap tm){
        BiggestDistanceCalculator calculator = new BiggestDistanceCalculator();
        Road road =  calculator.getBiggestDistance(tm.getRoads());
        System.out.println(road);
    }

    public static void testSortTransitMap(TransitMap tm){
        Collections.sort(tm.getRoads());
    }
}
