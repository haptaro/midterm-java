package ca.bcit.winter2021.comp2522.midterm.question5;

public class TestQuestion6 {
    public static void runAllTestScenariosForQuestion6(){

        //TODO: create an instance for every items shown on the table in the project desription.


        ca.bcit.winter2021.comp2522.midterm.question5.Table.Table table = null;
        //TODO: Create an instance of table.

        getTotalVolume(table);
        getTotalVolumeOfCubes(table);
        getTotalVolumeOfYellowItems(table);
    }


    //Note: Do not change these methods
    //Note: Do not change these methods
    //Note: Do not change these methods

    private static double getTotalVolume(ca.bcit.winter2021.comp2522.midterm.question5.Table.Table table){
        return table.getTotalVolume();
    }

    private static double getTotalVolumeOfCubes(ca.bcit.winter2021.comp2522.midterm.question5.Table.Table table){
        return table.getTotalVolumeOfCubes();
    }

    private static double getTotalVolumeOfYellowItems(Table.Table table){
        return table.getTotalVolumeOfYellowItems();
    }
}
