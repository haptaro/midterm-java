package ca.bcit.winter2021.comp2522.midterm.question4;

public class TestQuestion4 {
    public static void runAllTestScenariosForQuestion4(){

        DatabaseManager dbManager = null;
        dbManager = DatabaseManager.getInstance(3);
        System.out.println(dbManager);

        DatabaseManager dbManager1 = DatabaseManager.getInstance(3);
        DatabaseManager dbManager2 = DatabaseManager.getInstance(3);
        DatabaseManager dbManager3 = DatabaseManager.getInstance(3);

        System.out.println(dbManager1);
        System.out.println(dbManager2);
        System.out.println(dbManager3);

        //Note: Remember at this point the ObjectPool is full and therefore either an existing object should be returned or
        //no object should be returned.
        DatabaseManager dbManager4 = DatabaseManager.getInstance(3);
        System.out.println(dbManager4);

        DatabaseManager.makeObjectsFree();

        //Note: At this point there should be 3 instances of DatabaseManager in the pool and therefore, the getInstance method
        //should randonmly picked one and return it and set its isInUse to yes.
        DatabaseManager dbManager5 = DatabaseManager.getInstance(3);
        System.out.println(dbManager5);
    }
}
